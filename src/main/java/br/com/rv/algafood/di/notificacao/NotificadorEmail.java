package br.com.rv.algafood.di.notificacao;

import br.com.rv.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	private boolean caixaAuta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp=hostServidorSmtp;
		System.out.println("Construtor Notificação de Email Chamado");
	}

	@Override
	public void notificar (Cliente cliente, String mensagem) {
		if (this.caixaAuta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAuta(boolean caixaAuta) {
		this.caixaAuta = caixaAuta;
	}

}
