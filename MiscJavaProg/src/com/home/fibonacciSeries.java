package com.home;

public class fibonacciSeries {
	
	public static void main(String[] args) {
		
		
		int n =10;
		int n1 =0;
		int n2=1;
		int temp=0;

		while(n>0) {
			System.out.print(n1+"  ");

			temp = n1+n2;
			n1 =n2;
			n2 =temp;
     		n--;
			
		}
		
	}
	
	

}
