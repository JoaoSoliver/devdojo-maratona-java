package com.starsoftwares.javacore.a_introoducaoclasses.test;

import com.starsoftwares.javacore.a_introoducaoclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor("José Aldo", "Log_110011","555.666.777.88");
		Professor professor2 = new Professor("Florinda Mezza", "Ana_070815","777.888.666.55");
				
		System.out.println("-------------------------------");
		System.out.println(professor1.impressao());
		System.out.println("-------------------------------");
		System.out.println(professor2.impressao());
		System.out.println("-------------------------------");

	}

}
