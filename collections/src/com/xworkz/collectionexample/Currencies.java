package com.xworkz.collectionexample;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {
	
	public static void main(String pk []) {
		
		String cr1="Indian_Rupee";
		String cr2="US_Dollor";
		String cr3="Euro";
		String cr4="Angolan_Kwanza";
		String cr5="Argentine_Peso";
		String cr6="Armenian_Dram";
		String cr7="Aruban_Florin";
		String cr8="Brazilian_Real";
		String cr9="Pound_Terling";
		String cr10="Pataca";
		String cr11="Colombian_Peso";
		String cr12="Comoro_Franc";
		String cr13="Danish_Krone";
		String cr14="Iranian_Rial";
		String cr15="Rupaih";
		String cr16="Iraqi_Dinar";
		String cr17="North_Korean_Won";
		String cr18="Kuwait_Dinar";
		String cr19= "Denar";
		String cr20="Malagasy_Ariary";
		String cr21= "Rufiyaa";
		String cr22="Tugrika";
		String cr23="Metical";
		String cr24="Kyat";
		String cr25="Som";
		String cr26="Naira";
		
		Collection<String> currencies = new LinkedList();
		currencies.add(cr1);
		currencies.add(cr2);
		currencies.add(cr3);
		currencies.add(cr4);
		currencies.add(cr5);
		currencies.add(cr6);
		currencies.add(cr7);
		currencies.add(cr8);
		currencies.add(cr9);
		currencies.add(cr10);
		currencies.add(cr11);
		currencies.add(cr12);
		currencies.add(cr13);
		currencies.add(cr14);
		currencies.add(cr15);
		currencies.add(cr16);
		currencies.add(cr17);
		currencies.add(cr18);
		currencies.add(cr19);
		currencies.add(cr20);
		currencies.add(cr21);
		currencies.add(cr22);
		currencies.add(cr23);
		currencies.add(cr24);
		currencies.add(cr25);
		currencies.add(cr26);
		
		System.out.println(currencies.size());
		currencies.clear();

		System.out.println("after clearing.....");
		System.out.println(currencies.size());
		
		
		
	}

}
