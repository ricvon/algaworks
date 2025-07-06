package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorSMS implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de SMS %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
