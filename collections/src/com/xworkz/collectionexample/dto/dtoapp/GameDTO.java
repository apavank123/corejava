package com.xworkz.collectionexample.dto.dtoapp;

import java.io.Serializable;

public class GameDTO implements Serializable {

	private String name;
	private String type;
	private Integer totalPlayers;

	public GameDTO() {

	}

	public GameDTO(String name, String type, Integer totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;

	}

	@Override
	public boolean equals(Object reference) {
		System.out.println("running equals from gameDTO");
		if (reference != null) {
			if (reference instanceof GameDTO) {
				GameDTO dto = (GameDTO) reference;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
					return true;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "GameDTO [name =" + name + ", type = " + type + ", totalPlayers = " + totalPlayers + "]";

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
