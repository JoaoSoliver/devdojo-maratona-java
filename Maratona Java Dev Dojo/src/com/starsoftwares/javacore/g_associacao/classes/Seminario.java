package com.starsoftwares.javacore.g_associacao.classes;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;

	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}

	public Seminario(String titulo) {
		this.titulo = titulo;
	}

	public Seminario() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("----- RELATÓRIO SEMINÁRIO -----");
		System.out.println("Título:\n" + this.titulo);
		System.out.println("-------------------------------");		
		System.out.println("Local:");
		if(local != null) {
			System.out.println(this.local.getRua() + " - " + this.local.getBairro());			
		} else {
			System.out.println("Não há local cadastrado");
		}
		System.out.println("-------------------------------");		
		System.out.println("Professores:");
		if (professor != null) {
			System.out.println("** " + this.professor.getNome());
		} else {
			System.out.println("Não há professor cadastrado");
		}
		System.out.println("-------------------------------");

		System.out.println("Alunos participantes: ");
		if (alunos != null && alunos.length != 0) {
			for (Aluno aluno : alunos) {
				System.out.println("-- " + aluno.getNome());				
			}
		} else {
			System.out.println("Não há alunos cadastrados");
		}
		System.out.println("-------------------------------");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
