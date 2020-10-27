package com.starsoftwares.javacore.n_polimorfismo.test;

import com.starsoftwares.javacore.n_polimorfismo.classes.Funcionario;
import com.starsoftwares.javacore.n_polimorfismo.classes.Gerente;
import com.starsoftwares.javacore.n_polimorfismo.classes.RelatorioPagamento;
import com.starsoftwares.javacore.n_polimorfismo.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Gilvan Galo Doido", 5000, 2000);
		
		Vendedor v1 = new Vendedor("Astrid Fontes", 2500, 52000);
		
		RelatorioPagamento rp = new RelatorioPagamento();
//		rp.relatorioPagamentoGerente(g1);
//		rp.relatorioPagamentoVendedor(v1);
		
		rp.relatorioPagamentoGenerico(g1);;
		rp.relatorioPagamentoGenerico(v1);
		System.out.println("---------------------------");
		Funcionario f = g1;
		System.out.println("GERENTE\nSalario " + f.getSalario());
		System.out.println("---------------------------");
 
	}

}
