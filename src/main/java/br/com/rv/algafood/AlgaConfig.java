package br.com.rv.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rv.algafood.di.notificacao.NotificadorEmail;
import br.com.rv.algafood.di.service.AtivacaoClienteService;

//@Configuration --apenas comentei este configurador dos beans para podermos individualiarmos os configuradores de cada beans: NotificacaoConfig, ServiceConfig.
public class AlgaConfig {
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAuta(true);
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
