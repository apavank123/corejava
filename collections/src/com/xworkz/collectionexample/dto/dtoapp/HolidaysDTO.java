package com.xworkz.collectionexample.dto.dtoapp;

public class HolidaysDTO {

	private String type;
	private String announceBy;
	private Integer noOfDays;

	public HolidaysDTO() {
		
	}

	public HolidaysDTO(String type, String announceBy, Integer noOfDays) {
		this.type = type;
		this.announceBy = announceBy;
		this.noOfDays = noOfDays;
	}

	public String toString() {
		return "Holiday - [type - " + this.type + "announce by - " + this.announceBy + "noOfDays - " + this.noOfDays
				+ "]";

	}

	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof HolidaysDTO) {

				HolidaysDTO dto = (HolidaysDTO) obj;
				if (dto.type.equals(this.type)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAnnounceBy() {
		return announceBy;
	}

	public void setAnnounceBy(String announceBy) {
		this.announceBy = announceBy;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

}
