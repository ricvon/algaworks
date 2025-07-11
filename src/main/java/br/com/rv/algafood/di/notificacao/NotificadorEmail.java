package br.com.rv.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component 
public class NotificadorEmail implements Notificador{
	@Value("${notificador.email.host-servidor}")
	private String host;
	
	@Value("${notificador.email.porta-servidor}")
	private Integer porta;
	
	public NotificadorEmail() {
		System.out.println("Notificador Email Real.");
	}
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.println("Host: " + host);
		System.out.println("Porta: " + porta);
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
