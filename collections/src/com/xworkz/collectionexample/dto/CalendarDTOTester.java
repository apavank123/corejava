package com.xworkz.collectionexample.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionexample.dto.dtoapp.CalendarDTO;

public class CalendarDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		CalendarDTO dto1 = new CalendarDTO("Asali", "Kannad", 101);
		CalendarDTO dto2 = new CalendarDTO("TimesOfIndia", "English", 102);
		CalendarDTO dto3 = new CalendarDTO("Basaaweshwar", "Telagu", 103);
		CalendarDTO dto4 = new CalendarDTO("Mahananda", "Marathi", 104);
		CalendarDTO dto5 = new CalendarDTO("Vishala", "Kannad", 105);
		
		Collection<CalendarDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto4);
		System.out.println("contains or not : " + contain);
		
		boolean equal = dto1.equals(dto5);
		System.out.println("equal or not : " + equal);
		
		boolean equals = dto2.equals(dto4);
		System.out.println("equals or not : " + equals);

	}

}
