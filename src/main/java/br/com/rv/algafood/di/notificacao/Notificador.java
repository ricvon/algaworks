package br.com.rv.algafood.di.notificacao;

import br.com.rv.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}