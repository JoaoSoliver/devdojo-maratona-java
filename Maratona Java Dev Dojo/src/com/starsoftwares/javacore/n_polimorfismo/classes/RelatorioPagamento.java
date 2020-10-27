package com.starsoftwares.javacore.n_polimorfismo.classes;

public class RelatorioPagamento {
	
//	public void relatorioPagamentoGerente(Gerente gerente) {
//		System.out.println("Relatório de pagamento para gerência");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Salário: " + gerente.getSalario());
//	}
//	
//	public void relatorioPagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Relatório de pagamento para os vendedores");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Salário: " + vendedor.getSalario());
//	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario){
		System.out.println("Relatório de pagamento");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário: " + funcionario.getSalario());
	}

}
