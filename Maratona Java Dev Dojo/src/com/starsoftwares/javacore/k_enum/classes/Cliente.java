package com.starsoftwares.javacore.k_enum.classes;

// Constant especific class body --> Estudar esse conceito para certificação
// É a respeito da sobrescrita de um método de uma Enum

public class Cliente {
	
	public enum TipoPagamento{
		AVISTA("À vista"), APRAZO("À prazo");
		
		private String tpPg;

		private TipoPagamento(String tpPg) {
			this.tpPg = tpPg;
		}	
		
		public String getTpPg() {
			return this.tpPg;
		}
	}
	
	private String nome;
	private TipoCliente tipoCliente;	
	private TipoPagamento tipoPagamento;
	
	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		this.nome = nome;
		this.tipoCliente = tipo;
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente.getNome() + ", tipoPagamento=" + tipoPagamento.getTpPg() + "]";
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoCliente getTipo() {
		return tipoCliente;
	}
	
	public void setTipo(TipoCliente tipo) {
		this.tipoCliente = tipo;
	}
	
}
