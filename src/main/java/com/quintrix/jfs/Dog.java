package com.quintrix.jfs;

public class Dog {
	
	String name;
	int age;
	String bread;
	float price;
	
	public void setDog(String newName,int newAge, String newBread, float newPrice) {
		this.name = newName;
		this.age = newAge;
		this.bread = newBread;
		this.price = newPrice;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBread() {
		return bread;
	}
	public float getPrice() {
		return price;
	}

}
