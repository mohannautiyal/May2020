package com.home;

import java.util.ArrayList;

public class arraylistMethodsContd {

	public static void main(String[] args) {
 // Contains and Contains All

		ArrayList<employee> emp1= new ArrayList<employee>();
		ArrayList<employee> emp2 = new ArrayList<employee>();

        employee e1 = new employee("Madan",123);		
        employee e2 = new employee("Raj",223);		
        employee e3 = new employee("Shyam",323);		
        employee e4 = new employee("Kiran",423);	
        
        emp1.add(e1);
        emp1.add(e2);
        
        emp2.add(e3);
        emp2.add(e4);
        
        emp2.addAll(emp1);
        
        //System.out.println(emp2);
        for(employee emp:emp2) {
        	System.out.println(emp);
        }
        
        
        System.out.println(emp2.containsAll(emp1));
        
		/*
		 * emp2.removeAll(emp1); System.out.println(" All removing usign remove All ");
		 * for(employee emp:emp2) { System.out.println(emp); }
		 */
        
        emp2.retainAll(emp1);
        System.out.println(" All removing using retain All ");
        for(employee emp:emp2) {
        	System.out.println(emp);
        }
        
        
        
	}

}
