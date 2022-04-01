package com.quintrix.jfs;


public class App 
{
    public static void main( String[] args )
    {
       Dog dogOne = new Dog("Choppo",3,"Chiwawa",(float) 40.66);
       
       System.out.println(dogOne.toString());
       
       System.out.println("The name of the dog is " + dogOne.getAge() + "\nThey are " + dogOne.getAge() + "\nThey are a "+ dogOne.getBreed()+ "\nThey are for sale for $" + dogOne.getPrice());
    }
}
