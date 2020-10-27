package com.starsoftwares.javacore.l_classesabstratas.classes;

public class Vendedor extends Funcionario{
	
	private double valorTotalVendas;
			
	public Vendedor(String nome, String clt, double salario, double valorTotalVendas) {
		super(nome, clt, salario);
		this.valorTotalVendas = valorTotalVendas;
	}	

	public Vendedor() {
	}

	@Override
	public void calculaSalario() {
		
		this.salario = salario + (valorTotalVendas * 0.05);
		
	}	
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}

	public double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}


}
