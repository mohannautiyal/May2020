package com.home;

import java.util.ArrayList;

public class arraylistMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al1 = new ArrayList<Integer>(12);
		// default capacity is 10
		// new capacity : old *3/2 +1
		
		al1.add(10);
		al1.add(20);
		al1.add(2);
		
		// size of array
		System.out.println("size of array "+ al1.size());
		System.out.println(al1);
		
		// add element at specific position
		al1.add(1, 19);
		System.out.println(al1);
		
		// remove element
		al1.remove(2); // removes element at index 2
		System.out.println(al1);
		
		// add one collection to another 
	   ArrayList<Integer> al2 = new ArrayList<Integer>();
	   al2.add(10);	   
	   al1.addAll(al2);
	   System.out.println(al1);
	 
	   // adding one array list into another using constructor
	   ArrayList<Integer> al3 = new ArrayList<Integer>(al1);
       System.out.println(al3);
		
		
	}
}
