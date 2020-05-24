package com.home.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
		List<employee> employeeList = Arrays.asList(
				new employee("Manoj",34),
				new employee("Suraj",40),
				new employee("Rajesh",24),
				new employee("Suresh",38)				
				);
		
	String empName =	employeeList.stream().filter(x ->x.getEmpName().equals("Raj"))
        .map(employee::getEmpName)
        .findAny()
        .orElse("No Emp found");
        
		System.out.println(empName);
		
		List<String> empNames =employeeList.stream().map(employee::getEmpName)
		.collect(Collectors.toList());
		empNames.forEach(x -> System.out.println(x));
		
		
		
		
	}

}
