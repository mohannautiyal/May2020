package com.home;

import java.util.ArrayList;

public class arraylist {
	
	public static void main(String[] args) {
		
		// Collections can hold hetrogeneous data
		// Collections are not type safe.
		
		ArrayList al1 = new ArrayList();
		al1.add("10");
		al1.add("String");
		al1.add(new employee("Madan",123));
		
        for (Object o:al1) {
        	
        	if (o instanceof employee) {
        	   employee emp=	(employee)o;
        	   System.out.println(emp.getName()+" "+emp.getEmpno());
        		
        	}
        	else
        		System.out.println(o);;
        	
        }
		
        
        // Generics are used to provide type safety to collections
        System.out.println("========= Generics provide type safety ===========");
        ArrayList<employee> emp = new ArrayList<employee>();
        emp.add(new employee("Sachin",123));
        emp.add(new employee("Raj",223));

        
        for(employee e:emp) {
        	System.out.println(e.getName()+" "+e.getEmpno());
        }
        
        
	}

}
