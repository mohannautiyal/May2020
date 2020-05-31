package com.home.equals;

public class runnerClss {

	public static void main(String[] args) {

		student st1 = new student("mohan",1234);
		student st2 = new student("mohan",1234);
		
		student st3 = st1;
		
		
		System.out.println("===== Comparision using == for reference comparison =====");
		System.out.println("st1 == st2 " + (st1 == st2));
		System.out.println("st1 == st3 " + (st1 == st3));

		
		System.out.println("===== Comparision using Equals Method for content comparision =====");
		System.out.println("st1 Equals st2 " + (st1.equals(st2) ));
		System.out.println("st1 Equals st3 " + st1.equals(st3) );
         
		// st3 = null;
		 System.out.println(st3==null);
		
		
	}

}
