package com.home;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
		
	// Tree Set for sorted data. It allows only homogeneous data
		Set<String> student1 = new TreeSet<String>();
		student1.add("Madan");
		student1.add("Raj");
		student1.add("Rohan");
		student1.add("Amit");
		student1.add("Akshay");
		student1.add("Sumit");
		student1.add("Kavish");
		student1.add("Tarun");
    	System.out.println("\n");
		
	student1.stream().forEach(x ->System.out.print(x+" "));
		
		
		
		
	}

}
