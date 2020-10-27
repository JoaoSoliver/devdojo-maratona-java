package com.starsoftwares.javacore.b_introducaometodos.test;

import com.starsoftwares.javacore.b_introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {	
		
		Estudante est1 = new Estudante();
		est1.setNome("Jr Silva");
		est1.setIdade(-10);
		est1.setNotas(new double[] {4, 4.5 , 9});		
		
		est1.impressao();
		est1.media();
//		
//		est1.impressao2(35, 12, 21, 50, 300, 2020, 3010); *** testando o varargs... E funcionou muito bem. ***
//		
//		
//		for (int i = 0; i < est1.notas.length; i++) {			
//			notasRecebidas += "" + Double.toString(est1.notas[i]) + " ";
//		}	

	}
}
