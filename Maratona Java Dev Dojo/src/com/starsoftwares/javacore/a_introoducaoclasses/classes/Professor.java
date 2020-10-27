package com.starsoftwares.javacore.a_introoducaoclasses.classes;

/*
 * Crie os atributos abaixo para essa classe: 
 * Nome, matrícula, cpf;
 * Preencha e imprima os dados na classe teste.
 */

public class Professor {
	
	String nome;
	String matricula;
	String cpf;
	
	public Professor(String nome, String matricula,String cpf) {
		this.nome = nome;
		this.matricula =matricula;
		this.cpf = cpf;
	}
	
	public String impressao() {
		return "Professor(a): " + nome + "\nMatrícula: " + matricula + "\nCPF:: " + cpf;
	}


}
