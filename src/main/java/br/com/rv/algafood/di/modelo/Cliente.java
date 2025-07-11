package br.com.rv.algafood.di.modelo;

public class Cliente {
	private String Nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	public Cliente(String nome, String email, String telefone) {
		super();
		Nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public String getNome() {
		return Nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void ativar() {
		this.ativo=true;   
	}
}
