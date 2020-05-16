package com.home;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorArrayList {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<String>();
		student.add("Rishita");
		student.add("Kavya");
		student.add("Astha");
		student.add("Rajni");
		student.add("Vijay");

		// ways to fetch data

		// 1 using get and for loop

		for (int i = 0; i < student.size(); i++) {
			System.out.print(student.get(i) + " ");
		}
		System.out.println("\n============================");

		// using For each loop
		for (String s : student) {
			System.out.print(s + " ");
		}

		System.out.println("\n=============================");

		// using iterator
		Iterator itr = student.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
