package br.com.rv.algafood.di.service;

import br.com.rv.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	public Cliente cliente;
	
	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente=cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
}
