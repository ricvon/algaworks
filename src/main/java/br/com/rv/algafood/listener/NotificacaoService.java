package br.com.rv.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.rv.algafood.di.notificacao.NivelUrgencia;
import br.com.rv.algafood.di.notificacao.Notificador;
import br.com.rv.algafood.di.notificacao.TipoDoNotificador;
import br.com.rv.algafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event){
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
}
