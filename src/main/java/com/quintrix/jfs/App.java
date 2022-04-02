package com.quintrix.jfs;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
       Dog dogOne = new Dog("Choppo",3,"Chiwawa",(float) 40.66);
       
       
       List<Dog> dogList = new ArrayList<>();
       
       dogList.add(dogOne);
       
       Dog dogTwo = new Dog("Jasper", 6, "Husky", (float) 100.99);
       
       dogList.add(dogTwo);
       
       for(Dog d : dogList) {
    	   System.out.println(d.toString());
       }
       
       System.out.println("The name of the dog is " + dogOne.getAge() + "\nThey are " + dogOne.getAge() + "\nThey are a "+ dogOne.getBreed()+ "\nThey are for sale for $" + dogOne.getPrice());
    }
}
