package com.starsoftwares.javacore.f_modificadorestatico.classes;

// Velocidade limite deve ser de 240 km/h

public class Carro {
	
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	public Carro(String nome, double velocidadeMaxima) {
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	public void imprime() {
		System.out.println(this.nome + " - " + this.velocidadeMaxima + " Km/h | " + "Velocidade limite " + velocidadeLimite + " Km/h");
		System.out.println("--------------------------------------------------------");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}

	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}

}
