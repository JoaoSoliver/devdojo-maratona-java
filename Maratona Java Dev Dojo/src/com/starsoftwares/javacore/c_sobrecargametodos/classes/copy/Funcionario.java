package com.starsoftwares.javacore.c_sobrecargametodos.classes.copy;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private String rg = "---------------";
	private BigDecimal salario;
	
	public Funcionario(String nome, String cpf, BigDecimal salario, String rg) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
		setRg(rg);
	}
	
	public Funcionario() {
		System.out.println("Novo funcionário sendo cadastrado");
	}
	
	DecimalFormat df = new DecimalFormat("###,###.00");
	
	public void inicializa(String nome, String cpf, BigDecimal salario) {
		setNome(nome);
		setCpf(cpf);
		setSalario(salario);
	}
	
	public void inicializa(String nome, String cpf, BigDecimal salario, String rg) {
		inicializa(nome, cpf, salario);
		setRg(rg);
	}
	
//	public void imprime() {
//		System.out.println(getNome() + " - " + getCpf());
//		System.out.println("R$ " + df.format(getSalario()));
//	}
	
	public void imprime() {
		System.out.println(getNome());
		System.out.println("CPF " + getCpf());
		System.out.println("RG " + getRg());
		System.out.println("R$ " + df.format(getSalario()));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}	

}
