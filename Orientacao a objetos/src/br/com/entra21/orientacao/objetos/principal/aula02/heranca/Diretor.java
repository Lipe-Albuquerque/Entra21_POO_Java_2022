package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor {

	private String name;
	private byte age;
	private String cursoAtual;
	private byte quantidadeProfessores;
	public Diretor() {

	}

	public Diretor(String name, byte age) {

		this.name = name;

		this.age = age;

	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é "+this.name+ " e minha idade é "+ this.age);
		
		
	}
	
	public String getName() {
		//ler o valor la fora
		return this.name;
	}
	
	public void setName() {
		// receber um valor novo la de fora
		this.name=name;
	}
	
}
