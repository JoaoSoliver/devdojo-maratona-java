package com.starsoftwares.javacore.i_sobrescrita.classes;

public class Pessoa {
	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return (this.nome + " - " + this.idade + " anos"); 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
