package br.com.rv.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rv.algafood.di.modelo.Cliente;
import br.com.rv.algafood.di.notificacao.NivelUrgencia;
import br.com.rv.algafood.di.notificacao.Notificador;
import br.com.rv.algafood.di.notificacao.TipoDoNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component // comentei para configurar a instanciação via @Bean no AlgaConfig
public class AtivacaoClienteService {
	@TipoDoNotificador(NivelUrgencia.URGENTE)	
	@Autowired
	private Notificador notificador;

	@PostConstruct
	public void init() {
		System.out.println("inicializando...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destruindo...");		
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();		
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
