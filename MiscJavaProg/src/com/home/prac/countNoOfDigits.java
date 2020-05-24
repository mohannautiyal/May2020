package com.home.prac;

import java.util.Scanner;

public class countNoOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		
		int l = 1;
		while(num/10>0) {
			l++;
			num = num/10;
		}
		
		System.out.println("Number of digits in the number " +l);
		
		
	}

}
