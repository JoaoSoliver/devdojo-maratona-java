package com.starsoftwares.javacore.j_modificadorfinal.classes;

/*
 * FINAL na Classe impede que a mesma seja extendida;
 * No m�todo impede que o mesmo seja reescrito;
 * Na vari�vel de tipo primitivo n�o permite que o valor atribuido a mesma seja alterado,
 * na vari�vel do tipo refer�ncia n�o permite que a refer�ncia seja alterada.
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
