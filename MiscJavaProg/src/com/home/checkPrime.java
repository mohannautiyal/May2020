package com.home;

import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (isPrime(num))
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
		
		
		generatePrime(num);

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void generatePrime(int num) {
		for (int j = 2; j <= num; j++) {
			boolean isPrime = true;

			for (int i = 2; i <= j / 2; i++) {
				if (j % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				System.out.print(j + " ");

		}
	}

}
