package com.starsoftwares.javacore.i_sobrescrita.test;

import com.starsoftwares.javacore.i_sobrescrita.classes.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("José Silva");
		pessoa1.setIdade(85);
		
		System.out.println(pessoa1);
	}

}
