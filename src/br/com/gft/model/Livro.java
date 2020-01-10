package br.com.gft.model;

import br.com.gft.interfaces.*;

public class Livro extends Produto implements Imposto {
	
	String autor;
	String tema;
	int qtdPag;
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		setAutor(autor);
		setTema(tema);
		setQtdPag(qtdPag);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calcularImposto() {
		double imposto = 0;
		if(getTema().equalsIgnoreCase("educativo")) {
			
			System.out.printf("Livro educacional não tem imposto: %s \n", getNome());
			return 0;
			
		}else {
			imposto = getPreco() - getPreco()*(1 - 0.10);
			
			System.out.printf("R$ %.2f de imposto sobre o livro: %s \n", imposto, getNome());
			return 0;
		}
		
	}
	

	
	
	
	
}
