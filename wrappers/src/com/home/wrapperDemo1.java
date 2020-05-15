package com.home;

public class wrapperDemo1 {

	public static void main(String[] args) {
// primitive to wrapper object 
		int i = 10;
		Integer iw1 = new Integer(10);
		Integer iw2 = new Integer(i);
		Integer iw3 = Integer.valueOf(10);
		
		System.out.println(i+" "+iw1+" "+iw2);
		System.out.println(i==iw2);
		System.out.println(iw1==iw2);
		System.out.println(i==iw3);
		System.out.println("To String "+iw1.toString());
// wrapper object to primitive object		
		int i2 = iw1.intValue();
		int i3 = iw3.intValue();
      System.out.println(i2+i3);
		
	}

}
