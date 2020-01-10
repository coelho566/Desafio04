package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome;
	private int cnpj;
	
	List<Livro> livros = new ArrayList<Livro>();
	List<VideoGame> videoGames = new ArrayList<VideoGame>();
	
	public Loja(String nome, int cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		
		setNome(nome);
		setCnpj(cnpj);
		setLivros(livros);
		setVideoGames(videoGames);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


	public List<VideoGame> getVideoGames() {
		return videoGames;
	}


	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		
		if(livros.size() != 0) {
			System.out.println("A loja "+getNome()+" pussui estes livros para venda:");
		for (Livro livro : livros) {
			
		System.out.printf("Titulo: %s , Preco: R$ %.2f , Quantidade: %d em estoque \n", livro.getNome(), livro.getPreco(), livro.getQtd());
		}
		
		
		}else {
			
			System.out.println("A loja não tem livros no seu estoque");
		
		}
	}


	public void listaVideoGames() {
		
		if(videoGames.size() != 0) {
			System.out.println("A loja "+getNome()+" pussui estes video-games para venda:");
			for (VideoGame games : videoGames) {
				
			System.out.printf("Titulo: %s , Preco: R$ %.2f , Quantidade: %d em estoque \n", games.getNome(), games.getPreco(), games.getQtd());
			}
			
			
			}else {
				
				System.out.println("A loja não tem video-games no seu estoque \n");
			
			}
	}
	
	public double calculaPatrimonio() {
		double total = 0;
		double totalLivro = 0;
		double totalGame = 0;
		
		for (Livro livro : livros) {
			
			totalLivro += livro.getPreco() * livro.getQtd();
		}
		
		for(VideoGame game : videoGames) {
			
			totalGame += game.getPreco() * game.getQtd();
			}
		
			total = totalLivro + totalGame;
			
			 System.out.printf("O patrimonio da loja %s é de R$ %.2f \n", getNome(), total);
			 return 0;
			 
			 
		}
	
		
		
		
	}
	

