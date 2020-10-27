package com.starsoftwares.javacore.j_modificadorfinal.test;

import com.starsoftwares.javacore.j_modificadorfinal.classes.Carro;

public class CarroTest {
	
	public static void main(String[] args) {
	
	Carro carro = new Carro();
	System.out.println(carro.getComprador().getNome());
	carro.getComprador().setNome("Afrânio Solza");
	System.out.println(carro.getComprador().getNome());
	
	}
}
