package com.xworkz.collectionexample.lamdaExpression;

import java.io.Serializable;
// 03/01
import java.time.LocalDate;

public class MoviesDTO implements Serializable {

	private String name;
	private double budget;
	private String langauge;
	private double price;
	private LocalDate date;

	public MoviesDTO() {

	}

	public MoviesDTO(String name, double budget, String langauge, double price, LocalDate date) {

		this.name = name;
		this.budget = budget;
		this.langauge = langauge;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "MoviesDTO [name=" + name + ", budget=" + budget + ", langauge=" + langauge + ", price=" + price
				+ ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return 30;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {

			if (obj instanceof MoviesDTO) {

				MoviesDTO dto = (MoviesDTO) obj;
				if (dto.name.equals(this.name) && dto.langauge.equals(this.langauge)) {
					return true;
				}
			}
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	public String getLangauge() {
		return langauge;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
