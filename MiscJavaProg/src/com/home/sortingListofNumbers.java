package com.home;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sortingListofNumbers {

	public static void main(String[] args) {
    // Remove duplicates from a List using set    
	List<Integer> num = Arrays.asList(99,10,11,4,5,21,5,7,99,21);
	
	Set<Integer> remDups = new HashSet<Integer>(num);
	System.out.println(remDups);
		
		
	}

}
