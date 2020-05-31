package com.home.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class iteratorInMap {

	public static void main(String[] args) {
		Map<Integer,String> stud1 = new LinkedHashMap<Integer,String>();
		stud1.put(12, "Raj");
		stud1.put(22, "Sohan");
		stud1.put(31, "Manoj");
		stud1.put(41,"Karan");
		stud1.put(15, "Benny");
		stud1.put(11, "Shan");	

	   Set<Entry<Integer,String>> stuData = stud1.entrySet();
	   Iterator<Entry<Integer,String>> itr = stuData.iterator();
	 
	   while(itr.hasNext()) {
         Entry<Integer,String> e =  itr.next();
         System.err.println(e.getValue());
		   
	   }
	   
   
	   for(Entry<Integer,String> e: stud1.entrySet()) {
		   
		   System.out.println(e.getKey() + "  "+e.getValue());
	   }
	   
	
	}

}
