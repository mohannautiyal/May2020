package com.home.sorting;

import java.util.Comparator;

import com.home.Student;

public class studentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
				return o1.getStudentName().compareTo(o2.getStudentName());
	}

}
