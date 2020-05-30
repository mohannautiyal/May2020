package com.home;

import java.util.Set;
import java.util.TreeSet;

public class customizedSortingTreeSet {
	
	
	
	public static void main(String[] args) {
		// Use customized comparator to reverse sorting order
		Set<String> Students = new TreeSet<String>(new MyComparator());
		Students.add("Raj");
		Students.add("Abhinav");
		Students.add("Akshay");
		Students.add("Mohan");
		
		// Java 8 Cool features
		Students.forEach(s -> System.out.print(s+" "));
		System.out.println();
		Students.stream().map(x -> x.toUpperCase()+" | ")
		             .forEach(System.out :: print);
				
	}

}
