package com.home;

import java.util.Scanner;

public class countDigits {

	public static void main(String[] args) {

     System.out.print("Enter a number ");
     Scanner sc =  new Scanner(System.in);
     int num = sc.nextInt();
     int numofdigits = 0;

     while(num/10 > 0) {
    	 numofdigits++;
    	 num = num/10;
     }
     
     System.out.println("Number of Digits is "+(numofdigits+1));
     
		
	}

}
