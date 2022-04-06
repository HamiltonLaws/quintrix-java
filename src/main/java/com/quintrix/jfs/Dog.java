package com.quintrix.jfs;

public class Dog {

	private String name;
	private int age;
	private String breed;
	private float price;

	// creation
	public Dog(String name, int age, String breed, float price) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
