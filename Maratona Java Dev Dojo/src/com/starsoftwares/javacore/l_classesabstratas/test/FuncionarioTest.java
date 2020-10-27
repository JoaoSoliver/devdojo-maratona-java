package com.starsoftwares.javacore.l_classesabstratas.test;

import com.starsoftwares.javacore.l_classesabstratas.classes.Gerente;
import com.starsoftwares.javacore.l_classesabstratas.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		
	Vendedor v1 = new Vendedor("Ivan Guedes", "125251-6", 1500, 5000);
	v1.calculaSalario();
	Gerente g1 = new Gerente("Anna Furtado", "888777-4", 2500);
	g1.calculaSalario();
	System.out.println(v1);
	System.out.println("----------------");
	System.out.println(g1);
	

	}

}
