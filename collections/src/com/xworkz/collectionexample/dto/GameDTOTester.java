package com.xworkz.collectionexample.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collectionexample.dto.dtoapp.GameDTO;

public class GameDTOTester {

	public static void main(String[] args) {

		GameDTO gameDTO1 = new GameDTO("Kabaddi", "Indoor", 7);
		
		GameDTO gameDTO2 = new GameDTO("Cricket", "Outdoor", 11);
		//this.gameDTO
		boolean equals = gameDTO1.equals(gameDTO2);
		System.out.println(gameDTO1.getName().equals(gameDTO2.getName()));
		Collection <GameDTO> games = new ArrayList<GameDTO>();
		games.add(gameDTO1);
		games.add(gameDTO2);
		
		boolean contains = games.contains(gameDTO1);
		System.out.println("contains " +contains);
	}

}
