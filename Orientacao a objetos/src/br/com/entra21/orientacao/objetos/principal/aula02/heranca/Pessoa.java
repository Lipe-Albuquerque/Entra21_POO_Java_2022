package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Pessoa {
	private String name;
	private byte age;
	private String cpf;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String name, byte age, String cpf) {
		super();
		this.name = name;
		this.age = age;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
