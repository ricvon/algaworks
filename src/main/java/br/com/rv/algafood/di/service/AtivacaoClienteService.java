package br.com.rv.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;
import br.com.rv.algafood.di.notificacao.Notificador;

@Component // comentei para configurar a instanciação via @Bean no AlgaConfig
public class AtivacaoClienteService {
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();		
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
