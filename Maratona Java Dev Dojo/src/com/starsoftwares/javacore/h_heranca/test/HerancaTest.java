package com.starsoftwares.javacore.h_heranca.test;

import com.starsoftwares.javacore.h_heranca.classes.Endereco;
import com.starsoftwares.javacore.h_heranca.classes.Funcionario;
import com.starsoftwares.javacore.h_heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Francisco Cintra");
		Endereco end1 = new Endereco();
		Funcionario func1 = new Funcionario("Afrânio Guitar Top");
		
		func1.setSalario(7500);		
		end1.setRua("Rua dos Sem Asfalto");
		end1.setBairro("Bairro Pertin dos Outros");
		pessoa1.setCpf("012.223.344-55");
		pessoa1.setEndereco(end1);
		func1.setCpf("777.777.777.00");
		func1.setEndereco(end1);		
		
		pessoa1.print();
		func1.print();		
 
	}

}
