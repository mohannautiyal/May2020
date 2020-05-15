package com.home;

public class wrappercomparision {
	
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Integer j = Integer.valueOf(10);
		// == used for reference comparision
		System.out.println("== comparison : "+ (i==j));
		
		// equals method is used for content comparison
		System.out.println("equals comparision : "+ i.equals(j));
	
		
		String str1 ="new String";

		String str2 ="new String";
		System.out.println(str1==str2);
		
		Integer x = 500;
		Integer y = 500;
		System.out.println(x==y);
		
		// values are cached in the range of -128 to 127
		Integer a = 100;
		Integer b = 100;
		System.out.println(a==b);
				
		
		
	}

}
