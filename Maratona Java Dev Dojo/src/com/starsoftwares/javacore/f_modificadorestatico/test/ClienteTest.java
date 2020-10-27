package com.starsoftwares.javacore.f_modificadorestatico.test;

import com.starsoftwares.javacore.f_modificadorestatico.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		System.out.println("Opção de parcelamento");
		
//		for(int parcela : Cliente.getParcelas()) {
//			System.out.print(parcela + "  ");
//		}
		
		System.out.println("Tamanho " + Cliente.getParcelas().length);
		

	}

}
