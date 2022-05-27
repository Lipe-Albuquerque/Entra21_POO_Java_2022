package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo{
	
private String especie;

public Planta() {
	
}

public Planta(String especie) {
	super();
	this.especie = especie;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

@Override
public void alimentar(String alimento) {
	// TODO Auto-generated method stub
	System.out.println(this.especie+" eu não preciso de"+alimento+" pós faço fotosintese");
}

@Override
public void locomover() {
	// TODO Auto-generated method stub
	System.out.println(this.especie+ " : Não preciso me mexer, consigo tudo sem sair daqui");
	
}

@Override
public void comunicar(String conteudo) {
	// TODO Auto-generated method stub
	System.out.println(this.especie+" : Não fala porque ainda é muda! ");
	
}
	


}
