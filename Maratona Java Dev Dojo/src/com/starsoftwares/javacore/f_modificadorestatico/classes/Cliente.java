package com.starsoftwares.javacore.f_modificadorestatico.classes;

/*
 * 1 - O Bloco de inicialização estático é executado quando a JVM carregar a classe e é executado apenas 1 vez.
 * 2 - Alocação de espaço na memória para o objeto que será criado.
 * 3 - Cada atributo de classe é criado e inicializado com seus valores default ou explícitos.
 * 4 - O Bloco de inicialização é executado.
 * 5 - O Construtor é executado.
 * Um bloco de inicialização pode acessar atributos estáticos pois eles já existem antes da construção do objeto.
 */

public class Cliente {

	private static int[] parcelas;

	static {
		parcelas = new int[100];
		System.out.println("Dentro do BLOCO DE INICIALIZAÇÃO");
		for (int i = 1; i <= 100; i++) {
			parcelas[i -1] = i;
		}
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public static int[] getParcelas() {
		return parcelas;
	}





}
