package com.starsoftwares.javacore.m_interfaces.test;

import com.starsoftwares.javacore.m_interfaces.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Notebook", 4, 3000);
		
		produto1.calculaImposto();
		produto1.calculaFrete();
		
		System.out.println(produto1);

	}

}
