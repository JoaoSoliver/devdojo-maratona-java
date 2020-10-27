package com.starsoftwares.javacore.l_classesabstratas.classes;

public class Gerente extends Funcionario{

	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
		// TODO Auto-generated constructor stub
	}

	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void calculaSalario() {
		this.salario = salario + (salario * 0.2);
	}


}
