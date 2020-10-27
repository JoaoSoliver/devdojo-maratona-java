package com.starsoftwares.javacore.b_introducaometodos.classes;

import java.text.DecimalFormat;

/*
 * Cria a classe Estudante com nome, idade e notas (3 notas).
 * Crie o método imprimir os dados e a média desse aluno.
 * Caso a média seja maior do que 6 - aprovado.
 */

public class Estudante {
	
	private String nome;
	private int idade;
	private double[] notas;
//	private double[] notas2;
	private double media;
	private boolean aprovado;
	
	DecimalFormat df = new DecimalFormat("###,###.00");
	
//	public void impressao2(int idade, double... notas) {
//		this.idade = idade;
//		this.notas2 = notas;
//		
//		System.out.println(idade);
//		for(double aux : notas) {
//			System.out.print(aux + "  ");
//		}
//				
//	}
	
	public void impressao() {
		
		System.out.println(this.nome + " - " + getIdade() + " anos");
		
		if(notas == null) {
			System.out.println("Aluno sem notas");
			return;
		}
		
		System.out.print("Notas recebidas: ");
		for (double d : notas) {
			System.out.print(d + " ");
		}
	}
	
	public void media() {
		
		if(this.notas == null) {			
			return;
		}
		
		double auxMedia = 0;
		for (double d : notas) {
			auxMedia += d;	
		}
		media = auxMedia / notas.length;		
		System.out.println("\nMédia " + df.format(media) + " nessa matéria");
		if (media < 6) {
			System.out.println("Status: REPROVADO");
			aprovado = true;
		} else {
			System.out.println("Status: APROVADO");
			aprovado = false;
		}

	}	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
		System.out.println(this.idade + " - Valor inválido");
		return;
		}
		this.idade = idade;
	}
	
	public void setNotas (double[] notas) {
		this.notas = notas;
	}
	
	public int getNome() {
		return this.getNome();
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public double[] getNotas() {
		return this.notas;
	}
	
	public boolean isAprovado() {
		return aprovado;
	}
	
}
