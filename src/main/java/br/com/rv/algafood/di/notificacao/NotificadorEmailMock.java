package br.com.rv.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component 
public class NotificadorEmailMock implements Notificador{
	public NotificadorEmailMock() {
		System.out.println("Notificador Email MOCK.");
	}
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
