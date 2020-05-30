package com.home;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class countNoOfWords {

	public static void main(String[] args) {

		System.out.println("Enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		String [] words = str.split(" ");
	   List<String> wordlist= Arrays.asList(words) ;
	   
		// Distinct words in the sentence	   
	 Set<String> distinctWords = new LinkedHashSet<String>(wordlist);
	 System.out.println(distinctWords);
	 wordlist.stream().distinct()
	   .forEach(x -> System.out.print(x+" "));
	   
	
		
		
		
		
	}

}
