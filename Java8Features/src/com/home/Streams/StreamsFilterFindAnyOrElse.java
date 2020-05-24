package com.home.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFilterFindAnyOrElse {

	public static void main1(String[] args) {
// Filter--> find any -> or Else
		List<employee> employeeList = Arrays.asList(
				new employee("Manoj",34),
				new employee("Suraj",40),
				new employee("Raj",24),
				new employee("Suresh",38)				
				);
				
		
		employee emp =employeeList.stream().
		filter(x -> x.getEmpName().equals("Manoj"))
		.findAny()
		.orElse(null);
		
		System.out.println(emp.getEmpName());
			
	}
	
	
	// Using filter to find employee greater than certain age
	public static void main(String[] args) {
		List<employee> employeeList = Arrays.asList(
				new employee("Manoj",34),
				new employee("Suraj",40),
				new employee("Raj",24),
				new employee("Suresh",38)				
				);
		
		
	List<employee>	oldEmpList =employeeList.stream().filter(x-> x.getEmpAge()>35)
		            .collect(Collectors.toList());
	
	oldEmpList.forEach(x -> System.out.println(x.getEmpName() + "  "+x.getEmpAge()));
	
	
	
	
	
	
		
		
	}
	
	
	
	

}
