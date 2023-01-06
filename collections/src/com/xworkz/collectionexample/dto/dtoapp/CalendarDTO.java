package com.xworkz.collectionexample.dto.dtoapp;

public class CalendarDTO {
	
	private String name;
	private String language;
	private Integer id;
	
	public CalendarDTO() {
		
	}
	
	public CalendarDTO(String name, String language, Integer id) {
		this.name = name;
		this.language = language;
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof CalendarDTO) {
				CalendarDTO dto = (CalendarDTO)obj;
				if(dto.language.equals(this.language)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
