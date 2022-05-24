package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Funcionario {
	private String name;
	private byte age;
	private String cargoAtual;
	private float salario;

	public Funcionario() {

	}

	public Funcionario(String name, byte age, String cargoAtual, float salario) {
		this.age = age;
		this.name = name;
		this.cargoAtual = cargoAtual;
		this.salario = salario;

	}
}
