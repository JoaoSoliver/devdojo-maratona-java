package com.starsoftwares.javacore.t_datas.test;

import java.util.Calendar;

/*
 * A Classe Date j� � considerada uma classe bastante trabalhosa de se usar, com muitos m�todos depreciados 
 * e sem suporte para internacionaliza��o. Atualmente h� classes melhores para poder se trabalhar com datas.
 * A Classe Calendar � uma classe mais completa que a Date. Possui muitas op��es.
 * A partir do Java 8 o pacote Time foi adicionado para se trabalhar com datas.
 * Utilizamos basicamente 5 classes quando trabalhamos com datas, moedas ou localiza��o (envolvendo localiza��o):
 * NumberFormat, Locale, Calendar, Date, DateFormat.
 */

import java.util.Date;

public class Manipulacao {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance(); // � uma classe est�tica. Por isso n�o d� pra usar o new.
		System.out.println(calendar);
		
		if(Calendar.SUNDAY == calendar.getFirstDayOfWeek()) {
			System.out.println("� o 1� dia da semana");
		}
		
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // M�todo get recebendo uma contante est�tica referente a consulta
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		calendar.add(Calendar.HOUR, 23); // Adicionando 2 horas ao hor�rio. Com o add ele vira o dia se passar das 24 horas.
		calendar.roll(Calendar.MONTH, 2); // Acrescendo 2 meses. Com o roll somente o campo alterado recebe altera��o.
		
		Date date2 = calendar.getTime();
		
		System.out.println(date2); // Usando o Date pra imprimir os dados do Calendar de forma mais simples.
		
		
		
//		calendar.setTime(date); // Recebe um Date de algum c�digo legado e possibilita trabalhar com o Calendar. 
		
		
		
//		
//		Date date = new Date(); // Esse construtor recebe um long. Pra saber o momento atual basta us�-lo vazio.
//		
//		System.out.println("Tempo atual " + date);
//		System.out.println("Valor long " + date.getTime()); // Pra saber o long
		
		

	}

}
