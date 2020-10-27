package com.starsoftwares.javacore.l_classesabstratas.classes;

/*
 * Uma classe abstrata pode n�o ter nenhum m�todo abstrato como v�rios. Mas, caso uma classe tenha um m�todo abstrato,
 * obrigat�riamente a classe dever� ser abstrata. 
 * Um m�todo concreto � definido em uma classe abstrata quando � necess�rio que todas as subclasses tennham o mesmo comportamento
 * utilizando aquele m�todo.
 * Classes abstratas podem extender outras classes abstratas.
 * Implementando um m�todo abstrato em uma classe pai haver� a obrigatoriedade de que ele seja implementado na primeira classe 
 * concreta criada. Isso n�o ocorre nas filhas abstratas.
 * Mas, caso um m�todo abstrato da classe pai seja sobreescrito em uma classe filha, tamb�m abstrata, esse m�todo n�o precisar� 
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
