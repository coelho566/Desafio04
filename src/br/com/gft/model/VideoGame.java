package br.com.gft.model;
import br.com.gft.interfaces.*;
public class VideoGame extends Produto implements Imposto{
	
	String marca;
	String modelo;
	boolean isUsado;
		
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		setMarca(marca);
		setModelo(modelo);
		setUsado(isUsado);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calcularImposto() {
		
		double imposto = 0;
		
		if(this.isUsado() == true) {
			
			imposto = (getPreco() * 0.25);
			
			System.out.printf("Imposto %s, R$ %.2f \n", getNome(), imposto);
			return 0;
			
		}else {
			
			imposto = (getPreco() * 0.45);
			
			System.out.printf("Imposto %s, R$ %.2f \n", getNome(), imposto);
			return 0;
		}
	}
}
