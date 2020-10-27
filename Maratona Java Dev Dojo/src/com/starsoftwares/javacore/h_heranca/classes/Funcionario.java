package com.starsoftwares.javacore.h_heranca.classes;

import java.text.DecimalFormat;

public class Funcionario extends Pessoa {
	
	DecimalFormat df = new DecimalFormat("###,###.00");
	private double salario;
	
	public Funcionario(String nome) {
		super(nome);
	}

	public void print() {
		super.print();
		System.out.println("Eu, " + super.nome + ", recebi o salário no valor de " + df.format(this.salario) + " R$");
//		System.out.println(this.salario + " R$");	
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
