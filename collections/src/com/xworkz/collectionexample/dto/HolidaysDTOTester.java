package com.xworkz.collectionexample.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionexample.dto.dtoapp.HolidaysDTO;

public class HolidaysDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HolidaysDTO dto1 = new HolidaysDTO("Summer", "Headmaster", 60);
		HolidaysDTO dto2 = new HolidaysDTO("Dusshera", "HR", 7);
		HolidaysDTO dto3 = new HolidaysDTO("NationalHoliday", "BankManager", 2);
		HolidaysDTO dto4 = new HolidaysDTO("Flood", "Minister", 15);
		HolidaysDTO dto5 = new HolidaysDTO("Summer", null, 1);

		Collection<HolidaysDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);

		boolean contain = collection.contains(dto4);
		System.out.println("contains or not : " + contain);

		boolean equals = dto1.equals(dto5);
		System.out.println("equals or not : " + equals);

	}

}
