package com.starsoftwares.javacore.b_introducaometodos.classes;

public class Calculadora {
	
	public void soma2Numeros() {
		System.out.println(5 + 6);
	}
	
	public void subtrai2numeros() {
		System.out.println(15 - 6);
	}
	
	public void multiplica2Numeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divide2Numeros(double num1, double num2) {		
		if(num2 != 0) {
			return num1 / num2;			
		}
		return 0;
	}
	
	public void divisao2Numeros(double num1, double num2) {		
		if(num2 != 0) {
			System.out.println(num1 / num2);
			return;
		}
		System.out.println("O dividendo precisa ser diferente de ZERO");
	}
	
	public void altera2Numeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	public void somaArray(int[] numeros) {
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println("Números do array somados: " + soma);		
	}
	
/* Método varArgs:
 * Somente 1 por assinatura de método
 * Precisa ser o último parâmetro no método;
 *  
 */
	public void somaVarArgs(int...numeros) {
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println("Números varArgs somados: " + soma);
	}

}
