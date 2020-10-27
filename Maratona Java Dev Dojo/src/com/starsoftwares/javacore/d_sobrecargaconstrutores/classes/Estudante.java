package com.starsoftwares.javacore.d_sobrecargaconstrutores.classes;

public class Estudante {

	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula = "00/00/0000";
	
	public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
		this(nome, matricula, notas);
		this.dataMatricula = dataMatricula;
	}

	public Estudante(String nome, String matricula, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public Estudante() {		
	}
	
	public void impressao() {
		System.out.println(getNome() + " - " + getMatricula() + "  " + getDataMatricula());
		for (double d : notas) {
			System.out.print(d + "  ");
		}		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}


}
