package com.home.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.home.Student;

public class customizeSorting {

	public static void main(String[] args) {

		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student("Raj",1234));
		studentlist.add(new Student("Jai",2234));
		studentlist.add(new Student("Tina",3234));
		studentlist.add(new Student("Shyam",4234));
		studentlist.add(new Student("Harry",1534));
		System.out.println("_________________________________");

        System.out.println("Sorting based on roll no\n");
		Collections.sort(studentlist, new studentRollnoComparator());
		Iterator<Student> itr = studentlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("_________________________________");
        System.out.println("Sorting based on Student Name\n");
        Collections.sort(studentlist, new studentNameComparator());
		Iterator<Student> itr1 = studentlist.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
