package com.home.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithFlatMap {
	
	public static void main(String[] args) {
		
		List<Employees> emplist = new ArrayList<Employees>();
		Employees emp1 = new Employees();
		emp1.setEmpName("Madan");
		emp1.addDevices("Desktop Monitor");
		emp1.addDevices("Laptop");
		emp1.addDevices("Keyboard");
		emp1.addDevices("Mouse");

		Employees emp2 = new Employees();
		emp2.setEmpName("Rajesh");
		emp2.addDevices("Iphone");
		emp2.addDevices("Laptop");
		emp2.addDevices("Keyboard");
		emp2.addDevices("Tablet");
		
		emplist.add(emp1);
		emplist.add(emp2);
		
		//System.out.println(emp1.getDevices());
		
		
	  List<String> distinctDevices =emplist.stream().map(x ->x.getDevices())
		                .flatMap(x ->x.stream())
		                .distinct()
		             //   .filter(x -> x.compareTo("Keyboard")==0)
		                .collect(Collectors.toList());
      
	  System.out.println(distinctDevices);
	  
	  distinctDevices.forEach(System.out :: println);
		        
		
	}

}
