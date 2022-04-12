package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {

		// Playing around with Classes l

		List<Dog> dogList = new ArrayList<>();

		Dog dogOne = new Dog("Choppo", 3, "Chiwawa", (float) 40.66);

		dogList.add(dogOne);

		Dog dogTwo = new Dog("Jasper", 6, "Husky", (float) 55.99);
		Dog dogThree = new Dog("Buddy", 5, "Golden Retriver", (float) 66.99);
		Dog dogFour = new Dog("Happy", 3, "Corgi", (float) 59.99);
		Dog dogFive = new Dog("Lorenz", 4, "German Shepherd", (float) 56.99);
		Dog dogSix = new Dog("Poppy", 2, "Husky", (float) 69.99);

		dogList.add(dogTwo);
		dogList.add(dogThree);
		dogList.add(dogFour);
		dogList.add(dogFive);
		dogList.add(dogSix);

		// for (Dog d : dogList) {
		// System.out.println(d);
		// }
		// replaced for loop with a lambda expression
		dogList.forEach(p -> {
			System.out.println(p);
		});

		// Filers the list to show only the breads starting with H
		dogList.stream().filter((s) -> s.getBreed().startsWith("H")).forEach(System.out::println);

		// counts the number of dogs
		long count = dogList.stream().count();

		System.out.println("The list has " + count + " dogs");

		// gets the distinct breads in the list
		List<String> breedList = dogList.stream().map(d -> d.getBreed()).distinct().collect(Collectors.toList());

		System.out.println(breedList);

		// Finds any dog in the list
		dogList.stream().findAny().ifPresent(System.out::println);

	}
}
