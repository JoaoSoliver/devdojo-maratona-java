package com.starsoftwares.javacore.g_associacao.classes;

public class Aluno {
	private String nome;
	private int idade;
	private Seminario seminario;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Aluno() {
	}

	public void print() {		
		System.out.println("------- RELATÓRIO ALUNO -------");
		System.out.println(this.nome + " - " + this.idade + " anos");
		if(seminario != null) {
			System.out.println("Palestra : " + this.seminario.getTitulo());
			return;
		}
		System.out.println("Não participa de nenhuma palestra");
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
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
}
