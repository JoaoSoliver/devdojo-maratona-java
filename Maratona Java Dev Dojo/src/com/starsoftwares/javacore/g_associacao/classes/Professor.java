package com.starsoftwares.javacore.g_associacao.classes;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("----- RELATÓRIO PROFESSOR -----");
		System.out.println(this.nome);
		System.out.println("Especialidade");
		System.out.println(this.especialidade);
		if(seminarios != null && seminarios.length != 0) {
			System.out.println("Seminários ");
			for (Seminario seminario : seminarios) {
				System.out.println("*** " + seminario.getTitulo());
				return;
			}
			System.out.println("Não ministra nenhum seminário");
		}
		System.out.println("-------------------------------");
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
}
