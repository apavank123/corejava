package com.xworkz.collectionexample;

import java.util.ArrayList;
import java.util.Collection;

public class Sweet {

	public static void main(String[] args) {
		String sw1= "Shrikhand";
		String sw2= "Jalebi";
		String sw3= "Kheer";
		String sw4= "Rasmalai";
		String sw5= "Rasgulla";
		String sw6= "Ladoo";
		String sw7= "Kulfi";
		String sw8= "Basundi";
		String sw9= "Mysore_Pak";
		String sw10= "Balushahi";
		String sw11= "Bebinca";
		String sw12= "Khaja";
		String sw13= "Kaju_Katl";
		
		Collection<String> sweets = new ArrayList();
		sweets.add(sw1);
		sweets.add(sw2);
		sweets.add(sw3);
		sweets.add(sw4);
		sweets.add(sw5);
		sweets.add(sw6);
		sweets.add(sw7);
		sweets.add(sw8);
		sweets.add(sw9);
		sweets.add(sw10);
		sweets.add(sw11);
		sweets.add(sw12);
		sweets.add(sw13);
		
		System.out.println(sweets.size());
		sweets.clear();

		System.out.println("after clearing.....");
		System.out.println(sweets.size());
		
	}

}
