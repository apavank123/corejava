package com.xworkz.collectionexample.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionexample.dto.dtoapp.AirportDTO;

public class AirportTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirportDTO dto1 = new AirportDTO("Air India",200,"Bangalore");
		AirportDTO dto2 = new AirportDTO("Vistara",200,"Bagalkot");
		AirportDTO dto3 = new AirportDTO("Emirates",200,"Bangalore");
		AirportDTO dto4 = new AirportDTO("Air India",200,"Hubli");	
		AirportDTO dto5 = new AirportDTO("King Fisher",200,"Bagalkot");
		
		boolean equals = dto2.equals(dto5);
		System.out.println(dto2.getName().equals(dto5.getName()));
		Collection <AirportDTO> airPort = new ArrayList<AirportDTO>();
		airPort.add(dto1);
		airPort.add(dto2);
		airPort.add(dto3);
		airPort.add(dto4);
		airPort.add(dto5);
		
		boolean contains = airPort.contains(dto2);
		System.out.println("contains " +contains);
		
		
	}

}
