package com.starsoftwares.javacore.e_blocodeinicializacao.classes;

public class Cliente {
	
	private int[] parcelas;
	
	{
		parcelas = new int[100];
		System.out.println("Dentro do BLOCO DE INICIALIZAÇÃO");
		for (int i = 1; i <= 100; i++) {
			parcelas[i -1] = i;
		}
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}
	
	

}
