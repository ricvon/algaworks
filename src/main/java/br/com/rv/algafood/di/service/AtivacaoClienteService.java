package br.com.rv.algafood.di.service;

import br.com.rv.algafood.di.modelo.Cliente;
import br.com.rv.algafood.di.notificacao.Notificador;

//@Component --comentei para configurar a instanciação via @Bean no AlgaConfig
public class AtivacaoClienteService {
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador=notificador;	
		System.out.println("Construtor Ativador Cliente Service:"+notificador);		
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		//NotificadorEmail notificador = new NotificadorEmail();
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
