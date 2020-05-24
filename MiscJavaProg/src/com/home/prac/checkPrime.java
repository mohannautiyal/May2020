package com.home.prac;

public class checkPrime {

	public static void main(String[] args) {

		CheckPrime(31);
	}

	public static void CheckPrime(int n) {

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true)
				System.out.print(i + " ");
		}

	}
}
