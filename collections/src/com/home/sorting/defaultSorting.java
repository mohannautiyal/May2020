package com.home.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class defaultSorting {
	
	public static void main(String[] args) {
	
		// Sorting of integers stored in ArrayList
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(40);
		intArrList.add(20);
		intArrList.add(10);
		intArrList.add(50);
		intArrList.add(150);
 
		System.out.println("== Before Sorting ====");
		System.out.println(intArrList);
		System.out.println("== After Sorting ====");
		Collections.sort(intArrList);
		System.out.println(intArrList);
        Collections.reverse(intArrList);
		System.out.println("== Reverse Order ====");
		System.out.println(intArrList);

		System.out.println("\n\n");
      // Sorting of String stored in Linked List
		LinkedList<String> empList = new LinkedList<String>();
		empList.add("Madan");
		empList.add("Amit");
		empList.add("Raj");
		empList.add("Trivendra");
		Collections.sort(empList);
		System.out.println(empList);
		
		
		
	}
	
	
	

}
