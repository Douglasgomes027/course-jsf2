package br.com.douglas.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void LetraMaiuscula(){
		setNome(this.getNome().toUpperCase());
	}
	
	
}
