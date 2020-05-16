package com.home;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListSwapSublist {
	
	public static void main(String[] args) {
		
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Madan");
		emp.add("Raj");
		emp.add("Sohan");
		emp.add("Sumit");
		emp.add("Piyush");
		System.out.println(emp);
		System.out.println("After swapping");
		Collections.swap(emp, 2, 4);
		System.out.println(emp);
        System.out.println("=======================");
		System.out.println("Special Emp using sublist");
		ArrayList<String> specialEmp = new ArrayList<>(emp.subList(0, 3));
		System.out.println(specialEmp);
		
	}

}
