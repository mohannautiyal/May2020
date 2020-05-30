package com.home.cloning;

public class runnerClone {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		employee emp1 = new employee("Raj",1234);
	    System.out.println(emp1);
	    
	   employee emp2 =  emp1.clone();
	   System.out.println(emp2);
	}
}
