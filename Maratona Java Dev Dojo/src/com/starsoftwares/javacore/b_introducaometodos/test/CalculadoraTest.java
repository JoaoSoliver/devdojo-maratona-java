package com.starsoftwares.javacore.b_introducaometodos.test;

import com.starsoftwares.javacore.b_introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calc1 = new Calculadora();
		
		System.out.println("Adição");
		calc1.soma2Numeros();
		System.out.println("Subtração");
		calc1.subtrai2numeros();
		System.out.println("Multiplicação");
		calc1.multiplica2Numeros(12, 3);
		System.out.println("Divisão");
		System.out.println(calc1.divide2Numeros(13, 27));
		System.out.println("Divisão 2 números");
		calc1.divisao2Numeros(55, 13);
		
		int[] numeros = {6, 7, 8, 9};
		calc1.somaArray(numeros);
		
		
		calc1.somaVarArgs(7,8,9);
		
	}

}
