package com.tns.collections;

import java.util.Vector;

public class VectorExample {

	
		    public static void main(String[] args) {

		        Vector<String> fruits = new Vector<>();

		        // Adding elements
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Mango");

		        System.out.println("Vector: " + fruits);

		        // Adding an element at a specific position
		        fruits.add(1, "Orange");

		        System.out.println("After adding Orange: " + fruits);

		        // Removing an element
		        fruits.remove("Banana");

		        System.out.println("After removing Banana: " + fruits);

		        // Accessing an element
		        System.out.println("First element: " + fruits.get(0));
		    }
		
	}


