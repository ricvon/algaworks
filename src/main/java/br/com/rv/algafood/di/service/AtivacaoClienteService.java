package br.com.rv.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.modelo.Cliente;
import br.com.rv.algafood.di.notificacao.Notificador;

@Component // comentei para configurar a instanciação via @Bean no AlgaConfig
public class AtivacaoClienteService {
	@Autowired
	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		for (Notificador notificador : notificadores)
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
