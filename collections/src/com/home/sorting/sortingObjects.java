package com.home.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.home.employee;

public class sortingObjects {

	public static void main(String[] args) {

	// employee class needs to implement Comparable interface	
		
     ArrayList<employee> empList = new ArrayList<employee>();
     empList.add(new employee("Madan",123));
     empList.add(new employee("Amit",223));
     empList.add(new employee("Raj",423));
     empList.add(new employee("Shaili",723));
     empList.add(new employee("Kavya",923));
     empList.add(new employee("Rishita",923));
     
     Collections.sort(empList);
     
     Iterator itr = empList.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     

	}

}
