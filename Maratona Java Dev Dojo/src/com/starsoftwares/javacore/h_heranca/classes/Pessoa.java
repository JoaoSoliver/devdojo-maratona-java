package com.starsoftwares.javacore.h_heranca.classes;


public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void print() {
		System.out.println("----------Dados pessoais----------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println(this.endereco.getRua() + " - " + this.endereco.getBairro());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
