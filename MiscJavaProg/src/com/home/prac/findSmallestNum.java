package com.home.prac;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class findSmallestNum {

	public static void main(String[] args) {

		int n = 1425671;
		ArrayList<Integer> num = new ArrayList<Integer>();

		while (n > 0) {
			num.add(n % 10);
			n = n / 10;
		}
		Collections.sort(num);

		for (int number : num) {
			System.out.print(number);
		}

		// System.out.println(num);

	}

}
