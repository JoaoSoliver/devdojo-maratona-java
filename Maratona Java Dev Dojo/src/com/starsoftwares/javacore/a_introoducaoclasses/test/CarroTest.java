package com.starsoftwares.javacore.a_introoducaoclasses.test;

import com.starsoftwares.javacore.a_introoducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.modelo = "Audi TT";
		carro1.placa = "AUD0007";
		carro1.velocidadeMaxima = 350f;
		
		System.out.println("Automóvel\n-----------------");
		System.out.println(carro1.impressao());		
		System.out.println("-----------------");

	}

}
