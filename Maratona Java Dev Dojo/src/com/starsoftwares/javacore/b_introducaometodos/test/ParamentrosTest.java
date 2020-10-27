package com.starsoftwares.javacore.b_introducaometodos.test;

import com.starsoftwares.javacore.b_introducaometodos.classes.Calculadora;

public class ParamentrosTest {

	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora();
		
		int num1 = 5;
		int num2 = 10;
		
		calc1.altera2Numeros(num1, num2);
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
