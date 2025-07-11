package br.com.rv.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component 
public class NotificadorEmail implements Notificador{
	@Autowired
	private NotificadorProperties properties;
	
	public NotificadorEmail() {
		System.out.println("Notificador Email Real.");
	}
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta: " + properties.getPortaServidor());
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
