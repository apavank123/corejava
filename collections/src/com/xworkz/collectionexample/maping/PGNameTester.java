package com.xworkz.collectionexample.maping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PGNameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new HashMap<String, Double>();
		
		map.put("Maneruchi PG", 5000.00);
		map.put("Manjunath PG", 6000.00);
		map.put("Sai PG", 5500.00);
		map.put("Bhramhi PG", 5300.00);
		map.put("Maruti PG", 5500.00);
		map.put("Vinayak PG", 6200.00);
		map.put("Vivek PG", 6500.00);
		map.put("Shree Sai PG", 6100.00);
		map.put("Ganesh PG", 5800.00);
		map.put("Vishak PG", 5000.00);
		
		System.out.println("........keys......");
		Set<String> key= map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println(".........values.........");
		Collection<Double> values= map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println(".........entry.........");
		Set<Entry<String, Double>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));
		
		
	}

}
