package com.home.prac;

public class reverseString {

	
	public static void main(String[] args) {
		
		String str = "Madan Nautiyal";
		
		for(int i =str.length();i>0;i--) {
				System.out.print(str.charAt(i-1));
		}
	}
}
