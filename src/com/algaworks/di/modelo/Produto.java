package com.algaworks.di.modelo;

public class Produto {
	private String nome;
	private double valorTotal;
	public Produto(String nome, double d) {
		super();
		this.nome = nome;
		this.valorTotal = d;
	}
	public String getNome() {
		return nome;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	
}
