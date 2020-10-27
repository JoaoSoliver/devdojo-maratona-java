package com.starsoftwares.javacore.b_introducaometodos.test;

import com.starsoftwares.javacore.b_introducaometodos.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Horácio Clintum", "MA_3131", "123");
		Professor prof2 = new Professor("Walnete Fer", "PO_1758", "582");
		Professor prof3 = new Professor("Toninho", "BD_0606", "686");
		
		prof1.impressao2(prof1);
		
		System.out.println("+++++++++++++");
		
		System.out.println(prof2.impressao());
		
		System.out.println("+++++++++++++");
		
		prof3.impressao3();

	}

}
