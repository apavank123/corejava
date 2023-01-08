package com.xworkz.collectionexample.maping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PincodeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Long, String> map = new HashMap<Long, String>();
		map.put(587313l, "Mudhol");
		map.put(587567L, "Belgavi");
		map.put(587312L, "Terdal");
		map.put(587420L, "Hubli");
		map.put(587143L, "Baglkot");
		map.put(587987L, "Bilagi");
		map.put(587678L, "Dharwad");
		map.put(587225L, "koppal");
		map.put(587125L, "Jamakandhi");
		map.put(587765L, "Vijayapura");

		System.out.println("........keys......");
		Set<Long> key = map.keySet();
		key.forEach(e -> System.out.println(e));

		System.out.println(".........values.........");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println(".........entry.........");
		Set<Entry<Long, String>> entry = map.entrySet();
		entry.forEach(e -> System.out.println(e));

	}

}
