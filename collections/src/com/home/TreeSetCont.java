package com.home;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCont {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<Integer>();
		List<Integer> numbers = Arrays.asList(2, 4, 5, 7, 1, 10);
		num.addAll(numbers);
		num.forEach(System.out::print);
		System.out.println();
		SortedSet<Integer> ss = num.subSet(2,5);
		TreeSet<Integer> num1 = new TreeSet<Integer>(ss);

		num1.forEach(System.out::print);

	}

}
