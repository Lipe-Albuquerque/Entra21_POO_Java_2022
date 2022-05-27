package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Godzilla implements Individuo {
	private String nameMonster;
	private String poder;

	public Godzilla() {

	}

	public Godzilla(String nameMonster, String poder) {
		super();
		this.nameMonster = nameMonster;
		this.poder = poder;
	}

	public String getPoder() {
		this.poder = "Poderzinho que sai raio puffff";
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	@Override
	public void alimentar(String alimento) {
		// TODO Auto-generated method stub
		System.out.println(this.nameMonster + " come radiação MAS tambem " + alimento);
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println(this.nameMonster + " anda destruindo tudo");
	}

	@Override
	public void comunicar(String conteudo) {
		// TODO Auto-generated method stub
		System.out.println(this.nameMonster + " EU SOU UM MEGA MOSNTROOOOOOOOOOOOOO" + conteudo);
	}

	public String getNameMonster() {
		return nameMonster;
	}

	public void setNameMonster(String nameMonster) {
		this.nameMonster = nameMonster;
	}

}
