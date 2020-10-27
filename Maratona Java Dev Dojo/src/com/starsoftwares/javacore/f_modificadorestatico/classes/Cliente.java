package com.starsoftwares.javacore.f_modificadorestatico.classes;

/*
 * 1 - O Bloco de inicializa��o est�tico � executado quando a JVM carregar a classe e � executado apenas 1 vez.
 * 2 - Aloca��o de espa�o na mem�ria para o objeto que ser� criado.
 * 3 - Cada atributo de classe � criado e inicializado com seus valores default ou expl�citos.
 * 4 - O Bloco de inicializa��o � executado.
 * 5 - O Construtor � executado.
 * Um bloco de inicializa��o pode acessar atributos est�ticos pois eles j� existem antes da constru��o do objeto.
 */

public class Cliente {

	private static int[] parcelas;

	static {
		parcelas = new int[100];
		System.out.println("Dentro do BLOCO DE INICIALIZA��O");
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
