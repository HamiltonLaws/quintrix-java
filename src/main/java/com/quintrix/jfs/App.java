package com.quintrix.jfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// Playing around with Classes l

		List<Dog> dogList = new ArrayList<>();

		Dog dogOne = new Dog("Choppo", 3, "Chiwawa", (float) 40.66);

		dogList.add(dogOne);

		Dog dogTwo = new Dog("Jasper", 6, "Husky", (float) 100.99);

		dogList.add(dogTwo);

		for (Dog d : dogList) {
			System.out.println(d);
		}

		// System.out.println("The name of the dog is " + dogOne.getAge() + "\nThey are
		// " + dogOne.getAge() + "\nThey are a "+ dogOne.getBreed()+ "\nThey are for
		// sale for $" + dogOne.getPrice());

		// Trying stuff with I/O
		try {
			File myObj = new File("data.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter what you want to write to the file.");
		String userData = keyboard.nextLine();
		keyboard.close();
		try {
			FileWriter myWriter = new FileWriter("data.txt");
			myWriter.write(userData);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		try {
			File myObj = new File("data.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
