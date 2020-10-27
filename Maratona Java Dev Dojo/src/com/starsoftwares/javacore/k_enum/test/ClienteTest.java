package com.starsoftwares.javacore.k_enum.test;

import com.starsoftwares.javacore.k_enum.classes.Cliente;
import com.starsoftwares.javacore.k_enum.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Juca Bala", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
		System.out.println("Id Cliente Jurídico "+ TipoCliente.PESSOA_JURIDICA.getId());
		System.out.println("Id Cliente Jurídico "+ TipoCliente.PESSOA_JURIDICA.getIdOrdinal());
		System.out.println("Id Cliente Físico "+ TipoCliente.PESSOA_FISICA.getId());
		System.out.println("Id Cliente Físico "+ TipoCliente.PESSOA_FISICA.getIdOrdinal());
//		System.out.println("Id Cliente Jurídico "+ TipoCliente.PESSOA_JURIDICA.ordinal());
//		System.out.println("Id Cliente Físico "+ TipoCliente.PESSOA_FISICA.ordinal());
		
		System.out.println(cliente1);
	}

}
