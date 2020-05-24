package com.home.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	
	
	public static void main(String[] args) {
		
		List<String> students = Arrays.asList("Madan","Raj","Sohan","Sumit","Chaman");
		
		students.forEach(str -> System.out.print(str +" "));
		System.out.println();
		
		// filter will take a predicate which returns a boolean value for each condition
		
	   List<String> filteredstudents =	students.stream().filter(str-> !str.equals("Madan")).collect(Collectors.toList());
	   filteredstudents.forEach(str -> System.out.print(str+" "));
	
	   //   filteredstudents.forEach(System.out::print);
		
		
		
		
		
		
	}
}
