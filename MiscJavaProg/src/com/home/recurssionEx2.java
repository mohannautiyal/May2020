package com.home;

public class recurssionEx2 {

	public static void main(String[] args) {

        System.out.println(sumNumbers(3));
	
	}

	public static int  sumNumbers(int n) {
		System.out.println("Calling func with value "+n);
		if(n <= 0)
			return n;
		return n + sumNumbers(n-1);
		
	}
	
	
	
}
