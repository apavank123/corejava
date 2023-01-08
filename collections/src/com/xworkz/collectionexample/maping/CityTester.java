package com.xworkz.collectionexample.maping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Double, String> map = new HashMap<Double, String>();
		map.put(19D, "Bangalore");
		map.put(22D, "Mudhol");
		map.put(23D, "Jamakandhi");
		map.put(25D, "Bagalkote");
		map.put(26D, "Vijayapur");
		map.put(19D, "Belagavi");
		map.put(21D, "Mysore");
		map.put(24D, "Hubballi");
		map.put(23D, "Dharwad");
		map.put(27D, "Gokak");

		System.out.println("........keys......");
		Set<Double> key = map.keySet();
		key.forEach(e -> System.out.println(e));

		System.out.println(".........values.........");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println(".........entry.........");
		Set<Entry<Double, String>> entry = map.entrySet();
		entry.forEach(e -> System.out.println(e));

	}

}
