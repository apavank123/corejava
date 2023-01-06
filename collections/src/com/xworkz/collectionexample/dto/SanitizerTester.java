package com.xworkz.collectionexample.dto;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collectionexample.dto.dtoapp.SanitizerDTO;

public class SanitizerTester {

	public static void main(String[] args) {
		SanitizerDTO sanitizerDto1 = new SanitizerDTO(101, "Goodbye Germs", 100, "green");
		SanitizerDTO sanitizerDto2 = new SanitizerDTO(102, "Sterillium", 25, null);
		SanitizerDTO sanitizerDto3 = new SanitizerDTO(103, "Tidy Kitty", 30, "blue");
		SanitizerDTO sanitizerDto4 = new SanitizerDTO(104, "Serious Clean", 200, "white");
		SanitizerDTO sanitizerDto5 = new SanitizerDTO(105, "Wipe Out", 280, "pink");
		SanitizerDTO sanitizerDto6 = new SanitizerDTO(106, "Tweezy", 240, "brown");
		SanitizerDTO sanitizerDto7 = new SanitizerDTO(107, "Hanky Panky", 90, "green");
		SanitizerDTO sanitizerDto8 = new SanitizerDTO(108, "Handy Andy", 300, "blue");
		SanitizerDTO sanitizerDto9 = new SanitizerDTO(109, null, 200, "yellow");
		SanitizerDTO sanitizerDto10 = new SanitizerDTO(110, "Degreaser", 200, "orange");

		Collection<SanitizerDTO> coll = new LinkedList<SanitizerDTO>();
		coll.add(sanitizerDto1);
		coll.add(sanitizerDto2);
		coll.add(sanitizerDto3);
		coll.add(sanitizerDto4);
		coll.add(sanitizerDto5);
		coll.add(sanitizerDto6);
		coll.add(sanitizerDto7);
		coll.add(sanitizerDto8);
		coll.add(sanitizerDto9);
		coll.add(sanitizerDto10);

		System.out.println("==========total size=============");

		System.out.println(coll.size());

		System.out.println();

		System.out.println("=====================Max price value=======================");
		Iterator<SanitizerDTO> ref3 = coll.iterator();
		Integer max = 0;
		for (SanitizerDTO val : coll) {
			if (val.getPrice() > max) {
				max = val.getPrice();

			}

		}

		System.out.println(max);
		while (ref3.hasNext()) {

			SanitizerDTO ele3 = ref3.next();

			if (ele3.getPrice() == max) {
				System.out.println(ele3);
			}

		}

		System.out.println();
		System.out.println("===========Second largest price value=================");
		Iterator<SanitizerDTO> ref5 = coll.iterator();
		Integer secondMax = 0;
		for (SanitizerDTO val : coll) {

			if (val.getPrice() < max) {

				secondMax = val.getPrice();

			}

		}
		System.out.println(secondMax);
		while (ref5.hasNext()) {

			SanitizerDTO ele5 = ref5.next();

			if (ele5.getPrice() == secondMax) {
				System.out.println(ele5);
			}

		}
		System.out.println();

		System.out.println("================min price value========================");

		Iterator<SanitizerDTO> ref4 = coll.iterator();
		int min = 0;
		for (SanitizerDTO val : coll) {

			min = max;
			if (val.getPrice() < min) {
				max = val.getPrice();
			}
		}
		System.out.println(min);
		while (ref4.hasNext()) {
			SanitizerDTO ele4 = ref4.next();
			if (ele4.getPrice() == min) {
				System.out.println(ele4);
			}
		}

		System.out.println();
		System.out.println("===================price abv 30=====================");

		Iterator<SanitizerDTO> ref = coll.iterator();
		while (ref.hasNext()) {
			SanitizerDTO ele = ref.next();
			if (ele.getPrice() > 30) {
				System.out.println(ele);
			}
		}
		System.out.println();

		System.out.println("============= null values in properties ==========");
		Iterator<SanitizerDTO> ref1 = coll.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO ele1 = ref1.next();
			if (ele1.getBrand() == null || ele1.getColor() == null || ele1.getPrice() == 0) {
				System.out.println(ele1);
			}
		}
		System.out.println();

		System.out.println("==========remove specified color==========");
		Iterator<SanitizerDTO> ref2 = coll.iterator();
		while (ref2.hasNext()) {
			SanitizerDTO ele2 = ref2.next();
			if ("green".equals(ele2.getColor()) || "red".equals(ele2.getColor()) || "blue".equals(ele2.getColor())) {
				ref2.remove();
				System.out.println(ele2);
			}
		}
		System.out.println();

		System.out.println();
		System.out.println("==========total size after removing=============");

		System.out.println(coll.size());

	}

}
