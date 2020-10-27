package com.starsoftwares.javacore.f_modificadorestatico.test;

import com.starsoftwares.javacore.f_modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Fusca", 190);
		Carro c2 = new Carro("Corvette", 280);
		Carro c3 = new Carro("Bugatti", 350);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
//		Carro.velocidadeLimite = 110;
		System.out.println("");
		
		c1.setVelocidadeLimite(500);
		c1.imprime();
		c2.imprime();
		c3.imprime();
		
		
		
		
	}

}
