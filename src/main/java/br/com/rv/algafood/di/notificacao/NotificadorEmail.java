package br.com.rv.algafood.di.notificacao;

import br.com.rv.algafood.di.modelo.Cliente;

//@Component //comentei para simular uma ausência do bean notificador
public class NotificadorEmail implements Notificador{
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
