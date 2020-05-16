package com.home;

import java.util.ArrayList;
import java.util.Arrays;

public class conversionArrays {
	
	
    public static void main(String[] args) {
    	// Convert arrays to collection
    	
    	String [] emp = {"Madan","Raj","Shyam","Ashish","Bhupender"};
        ArrayList<String> empList = new ArrayList<String>(Arrays.asList(emp));
        System.out.println(empList);
        
       // Convert collection to arrays
        String [] empArr = new String[empList.size()];
        empList.toArray(empArr);
        System.out.println(empArr);

        for(String e:empArr) {
        	System.out.print(e+" ");
        }
        
        

	}
}
