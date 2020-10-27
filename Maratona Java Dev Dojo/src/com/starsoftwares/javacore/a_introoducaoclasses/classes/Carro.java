package com.starsoftwares.javacore.a_introoducaoclasses.classes;

public class Carro {
	
	public String placa;
	public String modelo;
	public float velocidadeMaxima;
	
	public String impressao() {
		return "Modelo: " + modelo + "\nPlaca: " + placa + "\nVelMax: " + velocidadeMaxima;
	}

}
