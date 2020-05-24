package com.home.prac;

public class recurssionFactorial {

	public static void main(String[] args) {
		int m = fibonacci(7);
		System.out.println("\n Factorial is " +m);
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 1;
		else
		{
			if(n==1)
				System.out.print(n );
			else
			System.out.print(n +" * ");
			return (n * fibonacci(n - 1));
		}
	}
}