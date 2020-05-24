package com.home;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setCollection {

	public static void main(String[] args) {
 // Insertion order is not preserved for HashSet 
		Set<String> students = new HashSet<String>();
		students.add("Madan");
		students.add("Raj");
		students.add("Rohan");
		students.add("Amit");
		students.add("Akshay");
		students.add("Sumit");
		students.add("Kavish");
		students.add("Tarun");
		
		for(String stuName:students) {
			System.out.print(stuName +" ");
		}

 // Insertion order is preserved for Linked Hash Set	
		Set<String> student = new LinkedHashSet<String>();
		student.add("Madan");
		student.add("Raj");
		student.add("Rohan");
		student.add("Amit");
		student.add("Akshay");
		student.add("Sumit");
		student.add("Kavish");
		student.add("Tarun");
		System.out.println("\n");
		for(String stuName:student) {
			System.out.print(stuName +" ");
		}
	}

}
