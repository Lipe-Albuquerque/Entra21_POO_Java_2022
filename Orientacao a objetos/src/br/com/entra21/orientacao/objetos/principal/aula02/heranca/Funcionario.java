package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

//
public class Funcionario {
	private String name;
	private byte age;
	private String cargoAtual;
	private float salario;

	public String getName() {
		return name;
	}

	public Funcionario(String name, byte age, String cargoAtual, float salario) {
		super();
		this.name = name;
		this.age = age;
		this.cargoAtual = cargoAtual;
		this.salario = salario;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Funcionario() {

	}

}
