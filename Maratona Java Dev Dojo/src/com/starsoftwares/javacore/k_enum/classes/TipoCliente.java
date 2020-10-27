package com.starsoftwares.javacore.k_enum.classes;

public enum TipoCliente {
	
	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Jurídica"){
		public String getId() {
			return "B";
		}
	};
	
	private int tipo;
	private String nome;
	private int idOrdinal;
	
	private TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}
	
	public String getId() {
		return "A";
	}
	
	public int getIdOrdinal() {
		if (ordinal() == 0) {
			idOrdinal = 1;
		} else {
			idOrdinal = 2;
		}		
		return idOrdinal;
	}
}
