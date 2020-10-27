package com.starsoftwares.javacore.e_blocodeinicializacao.test;

import com.starsoftwares.javacore.e_blocodeinicializacao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Opção de parcelamento");
		
		for(int parcela : cliente1.getParcelas()) {
			System.out.print(parcela + "  ");
		}

	}

}
