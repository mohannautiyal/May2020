package com.home.sorting;

import java.util.Comparator;

import com.home.Student;

public class studentRollnoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getRollno() == o2.getRollno())
			return 0;

		if (o1.getRollno() > o2.getRollno())
			return 1;
		else
			return -1;
	}

}
