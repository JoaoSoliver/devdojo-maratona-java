package com.starsoftwares.javacore.g_associacao.test;

import com.starsoftwares.javacore.g_associacao.classes.Aluno;
import com.starsoftwares.javacore.g_associacao.classes.Local;
import com.starsoftwares.javacore.g_associacao.classes.Professor;
import com.starsoftwares.javacore.g_associacao.classes.Seminario;

public class SeminarioTest {

	public static void main(String[] args) {
		
		Seminario seminario1 = new Seminario("Programando em alto nível");
		
		Local local1 = new Local("Rua Sem Saída", "Bairro Distante");
		
		Professor professor1 = new Professor("Confucio Lino", "Não se confudir");
		Professor professor2 = new Professor("Sr. Sabão Silva", "Aprendendo a Saber");
		
		Aluno aluno1 = new Aluno("Jeff Fernandes", 33);
		Aluno aluno2 = new Aluno("Alex Alintu", 37);
		
		seminario1.setLocal(local1);
		
		seminario1.setProfessor(professor1);
		
		seminario1.setAlunos(new Aluno[] {aluno1, aluno2});
		seminario1.print();
		local1.print();
		professor1.print();
		professor2.print();
		
		aluno1.setSeminario(seminario1);
		aluno1.print();
		aluno2.setSeminario(seminario1);
		aluno2.print();
		
		
	}

}
