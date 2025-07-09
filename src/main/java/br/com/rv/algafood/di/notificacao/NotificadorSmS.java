package br.com.rv.algafood.di.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;

@Primary
@Component 
public class NotificadorSmS implements Notificador{
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefon %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}


}
