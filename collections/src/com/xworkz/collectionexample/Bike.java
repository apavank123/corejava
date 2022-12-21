package com.xworkz.collectionexample;

import java.util.Collection;
import java.util.TreeSet;

public class Bike {
	
	public static void main(String[] args) {
		
		String bk1 = "NS_200";
		String bk2 = "RS_200";
		String bk3 = "Royal_Enfield";
		String bk4 = "Activa_5G";
		String bk5 = "Pulser_150";
		String bk6 = "Himalayan";
		String bk7 = "Yamaha";
		String bk8 = "Hero";
		String bk9 = "Duke_390";
		String bk10 = "KTM";
		String bk11 = "JAWA";
		String bk12 = "Thunder_Bolt";
		String bk13 = "TVS";
		String bk14= "TVS_Apache";
		String bk15 = "Beleni";
		String bk16 = "Suzuki";
		String bk17 = "X_Blade";
		String bk18 = "Yamaha_R15";
		
		Collection <String> bikes = new TreeSet();
		bikes.add(bk1);
		bikes.add(bk2);
		bikes.add(bk3);
		bikes.add(bk4);
		bikes.add(bk5);
		bikes.add(bk6);
		bikes.add(bk7);
		bikes.add(bk8);
		bikes.add(bk9);
		bikes.add(bk10);
		bikes.add(bk11);
		bikes.add(bk12);
		bikes.add(bk13);
		bikes.add(bk14);
		bikes.add(bk15);
		bikes.add(bk16);
		bikes.add(bk17);
		bikes.add(bk18);
		
		System.out.println(bikes.size());
		bikes.clear();

		System.out.println("after clearing.....");
		System.out.println(bikes.size());
		
	}

}
