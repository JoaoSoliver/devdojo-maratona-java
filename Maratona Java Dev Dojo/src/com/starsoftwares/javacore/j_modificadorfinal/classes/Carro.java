package com.starsoftwares.javacore.j_modificadorfinal.classes;

/*
 * FINAL na Classe impede que a mesma seja extendida;
 * No método impede que o mesmo seja reescrito;
 * Na variável de tipo primitivo não permite que o valor atribuido a mesma seja alterado,
 * na variável do tipo referência não permite que a referência seja alterada.
 */

public class Carro {
	
	private final Comprador COMPRADOR = new Comprador();
	public static final int VELOCIDADE_FINAL = 250;
	private String nome;
	private String marca;
		
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}	
	
	public void imprime() {
		System.out.println("Imprimindo um carro");
	}
		
	public Comprador getComprador() {
		return COMPRADOR;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
