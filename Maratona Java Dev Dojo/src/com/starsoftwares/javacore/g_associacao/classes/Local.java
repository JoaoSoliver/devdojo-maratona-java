package com.starsoftwares.javacore.g_associacao.classes;

public class Local {
	private String rua;
	private String bairro;
	
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public Local() {
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("------- RELATÓRIO LOCAL -----");
		System.out.println(this.rua +  " - " + this.bairro);
		System.out.println("-----------------------------");
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
		
}
