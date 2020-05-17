package com.home;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Maruti");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Tata");
		cars.add("BMW");

		ListIterator<String> li = cars.listIterator();

		// Reading data forward direction using list iterator
		while (li.hasNext()) {
			System.out.print(li.next() + " ");

		}

		System.out.println("\n=====Iterating in reverse order========");

		// Reading data using backward iterator
		while (li.hasPrevious()) {
			System.out.print(li.previous() + "  ");

		}

		// Removing and Replacing data using list iterator
		while (li.hasNext()) {
			String carManufacturer = li.next();
			if (carManufacturer == "Hyundai")
				li.remove();
			
			  if(carManufacturer== "Maruti")
				  li.set("Ford"); // Replace Maruti with Ford
			 
		}

		li.add("Mercedes");
	
		System.out.println("\n" + cars);

	}

}
