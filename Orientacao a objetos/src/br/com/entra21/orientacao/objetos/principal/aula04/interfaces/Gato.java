package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Gato implements Individuo{
	private String name;
	private Pessoa dono;
	
	public Gato() {
		
	}

	public Gato(String name, Pessoa dono) {
		super();
		this.name = name;
		this.dono = dono;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public void alimentar(String alimento) {
		// TODO Auto-generated method stub
		System.out.println(this.dono+ " Miau posso nao gostar disso!, mas meu dono "+this.dono.getNome()+" só me da "+ alimento);
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" miau prefiro dormir");
	}

	@Override
	public void comunicar(String conteudo) {
		// TODO Auto-generated method stub
		System.out.println(this.name+ "miau miau miau traduzindo"+conteudo);
		
	}
	
}
