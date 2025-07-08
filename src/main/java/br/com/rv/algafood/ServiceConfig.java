package br.com.rv.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rv.algafood.di.notificacao.Notificador;
import br.com.rv.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
