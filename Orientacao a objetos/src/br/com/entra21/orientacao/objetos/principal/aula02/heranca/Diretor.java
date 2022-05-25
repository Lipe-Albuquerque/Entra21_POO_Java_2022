package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa{


	private String cursoAtual;
	private byte quantidadeProfessores;
	public Diretor() {
		
	}

	public Diretor(String name, byte age, byte quantidadeProfessores, String cursoAtual) {
		super(name, age, cursoAtual)
	this.quantidadeProfessores = quantidadeProfessores;
	this.cursoAtual = cursoAtual;
	

	}

	public void realizarApresentacao() {
		System.out.println("Oi meu nome é  e minha idade é ");
		
		
	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	
	
}
