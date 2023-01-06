package com.xworkz.collectionexample.lamdaExpression;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoviesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoviesDTO dto = new MoviesDTO("KGF", 1000, "Kannada", 100, LocalDate.of(2023, 10, 02));
		MoviesDTO dto1 = new MoviesDTO("A", 2500, "Hindi", 200, LocalDate.of(2022, 04, 8));
		MoviesDTO dto2 = new MoviesDTO("Kantar", 3000, "Kannada", 150, LocalDate.of(2013, 10, 25));
		MoviesDTO dto3 = new MoviesDTO("OM", 1500, "Hindi", 250, LocalDate.of(2024, 05, 8));
		MoviesDTO dto4 = new MoviesDTO("Vikram", 500, "Kannada", 300, LocalDate.of(2023, 12, 04));
		MoviesDTO dto5 = new MoviesDTO("Sampattige Sawal", 3500, "Hindi", 50, LocalDate.of(2022, 3, 9));

		Collection<MoviesDTO> collection = Stream.of(dto, dto1, dto2, dto3, dto4, dto5).collect(Collectors.toList());
		// collection.stream().sorted((a1, a2)->)

		System.out.println("Sorting names in ascending order......");

		collection.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(e -> System.out.println(e));

		System.out.println("============================================================");
		System.out.println("Sorting name by descending order.............");
		collection.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.forEach(e -> System.out.println(e));

		System.out.println("============================================================");
		System.out.println("Sorted Budget by Acse..........");
		collection.stream().sorted((q1, q2) -> Double.compare(q1.getBudget(), q2.getBudget()))
				.forEach(e -> System.out.println(e));

		System.out.println("============================================================");
		System.out.println("Sorted Budget by descending...............................");
		collection.stream().sorted((a1, a2) -> Double.compare(a2.getBudget(), a1.getBudget()))
				.forEach(e -> System.out.println(e));

		System.out.println("============================================================");
		System.out.println("Sorted Langauge by ascending...............................");
		collection.stream().sorted((a1, a2) -> a1.getLangauge().compareTo(a2.getLangauge()))
				.forEach(e -> System.out.println(e));

	}

}
