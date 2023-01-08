package com.xworkz.collectionexample.maping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Double, String> map = new HashMap<Double, String>();
		map.put(40.00, "Snikers");
		map.put(20.00, "Dairy_Milk");
		map.put(30.00, "Cadbury ");
		map.put(50.00, "Nestle");
		map.put(80.00, "Amul");
		map.put(20.00, "Parle");
		map.put(50.00, "Mars ");
		map.put(10.00, "Kit_Kat");
		map.put(100.00, "Lotus");
		map.put(400.00, "Ferrero Rocher");
		
		System.out.println("........keys......");
		Set<Double> key = map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println(".........values.........");
		Collection<String> values = map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println(".........entry.........");
		Set<Entry<Double, String>> entry = map.entrySet();
		entry.forEach(e->System.out.println(e));
	}

}
