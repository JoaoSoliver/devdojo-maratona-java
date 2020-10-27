package com.starsoftwares.javacore.a_introoducaoclasses.test;

import com.starsoftwares.javacore.a_introoducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		
		Estudante aluno1 = new Estudante();
		
		aluno1.nome = "Jeff";
		aluno1.matricula = "ADS_052020";
		aluno1.idade = 33;		
		
		System.out.println("----------------------------");
		System.out.println(aluno1.impressao());
		System.out.println("----------------------------");
	}

}
