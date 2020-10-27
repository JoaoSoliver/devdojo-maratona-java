package com.starsoftwares.javacore.n_polimorfismo.classes;

public class RelatorioPagamento {
	
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Relat�rio de pagamento para ger�ncia");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Sal�rio: " + gerente.getSalario());
//	}
//	
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Relat�rio de pagamento para os vendedores");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Sal�rio: " + vendedor.getSalario());
//	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario){
		System.out.println("Relat�rio de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Sal�rio: " + funcionario.getSalario());
	}

}
