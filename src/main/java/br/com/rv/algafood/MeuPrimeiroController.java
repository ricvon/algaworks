package br.com.rv.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.rv.algafood.di.modelo.Cliente;
import br.com.rv.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoclienteService) {
		this.ativacaoClienteService=ativacaoclienteService;
		System.out.println("Meu primeiro Controller: "+ativacaoclienteService);
	}
		@GetMapping("/hello")
		@ResponseBody
		public String hello() {
			Cliente joao = new Cliente("João", "joao@xyz.com", "349998888");
			this.ativacaoClienteService.ativar(joao);
			return "ativado o cliente e enviado o email";
		}
}
