package com.xworkz.collectionexample.maping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class CompanyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put("TCS", "Software_Comapny");
		map.put("HCLTech", "Mechanical_Based_Company");
		map.put("Robert Bosch", "Software_Comapny");
		map.put("Infosys", "Software_Comapny");
		map.put("Capgemini", "Software_Comapny");
		map.put("Tech_Centra", "ECE_Based_Company");
		map.put("Wipro", "Software_Comapny");
		map.put("Tata", "Mechanical_Based_Company");
		map.put("Cognizant", "Software_Comapny");
		map.put("Lam Research", "Mechanical_Based_Company");
		
		System.out.println("........keys......");
		Set<String> key = map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println(".........values.........");
		Collection<String> values = map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println(".........entry.........");
		Set<Entry<String, String>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));
		
	}

}
