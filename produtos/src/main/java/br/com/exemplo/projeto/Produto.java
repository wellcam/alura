package br.com.exemplo.projeto;

public class Produto {
	
	private final String nome;
	private final double preco;
	
	public Produto (String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
}
