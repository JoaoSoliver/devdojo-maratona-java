package com.starsoftwares.javacore.t_datas.test;

/*
 * Essa Classe já possui alguns modelos predefinidos de impressão
 */

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		DateFormat[] df = new DateFormat[6];
		
		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		for (DateFormat dateFormat : df) {
			System.out.println(dateFormat.format(calendar.getTime()));
		}

	}

}
