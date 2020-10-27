package com.starsoftwares.javacore.c_sobrecargametodos.test;

import java.math.BigDecimal;

import com.starsoftwares.javacore.c_sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.inicializa("Ben Harper", "015.058.987-00", new BigDecimal(7653));	
		func2.inicializa("Lill Still", "515.658.870-55", new BigDecimal(13504), "15.804.123");	
		
		System.out.println("############################");
		func1.imprime();
		System.out.println("############################");
		func2.imprime();
		System.out.println("############################");

	}

}
