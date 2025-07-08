
package br.com.rv.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rv.algafood.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAuta(true);
		return notificador;
	}
}
