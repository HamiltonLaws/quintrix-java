package com.quintrix.jfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
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
