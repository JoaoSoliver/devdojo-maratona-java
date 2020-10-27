package com.starsoftwares.javacore.l_classesabstratas.classes;

/*
 * Uma classe abstrata pode não ter nenhum método abstrato como vários. Mas, caso uma classe tenha um método abstrato,
 * obrigatóriamente a classe deverá ser abstrata. 
 * Um método concreto é definido em uma classe abstrata quando é necessário que todas as subclasses tennham o mesmo comportamento
 * utilizando aquele método.
 * Classes abstratas podem extender outras classes abstratas.
 * Implementando um método abstrato em uma classe pai haverá a obrigatoriedade de que ele seja implementado na primeira classe 
 * concreta criada. Isso não ocorre nas filhas abstratas.
 * Mas, caso um método abstrato da classe pai seja sobreescrito em uma classe filha, também abstrata, esse método não precisará 
 * ser sobrescrito nos filhos concretos.
 */

public abstract class Funcionario extends Pessoa {

	protected String clt;
	protected double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}	
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}	

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}

	public abstract void calculaSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
