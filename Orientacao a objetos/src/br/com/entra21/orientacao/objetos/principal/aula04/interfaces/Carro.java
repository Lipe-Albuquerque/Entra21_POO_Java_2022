package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Carro implements Individuo{
	private String marca;

	public Carro() {
		
	}

	
	public Carro(String marca) {
		super();
		this.marca = marca;
	}
	public void acelerar() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void alimentar(String alimento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comunicar(String conteudo) {
		// TODO Auto-generated method stub
		
	}

	
	
}
