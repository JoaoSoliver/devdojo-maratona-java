package com.starsoftwares.javacore.b_introducaometodos.classes;

/*
 * Crie os atributos abaixo para essa classe: 
 * Nome, matrícula, cpf;
 * Preencha e imprima os dados na classe teste.
 */

public class Professor {

	public String nome;
	public String matricula;
	public String cpf;

	public Professor(String nome, String matricula,String cpf) {
		this.nome = nome;
		this.matricula =matricula;
		this.cpf = cpf;
	}

	public String impressao() {
		return "Professor(a): " + nome + "\nMatrícula: " + matricula + "\nCPF:: " + cpf;
	}

	public void impressao2(Professor prof) {
		System.out.println("Professor(a): " + nome + "\nMatrícula: " + matricula + "\nCPF:: " + cpf);
	}

	public void impressao3() {
		System.out.println("Professor(a): " + this.nome + "\nMatrícula: " + this.matricula + "\nCPF:: " + this.cpf);
	}


}
