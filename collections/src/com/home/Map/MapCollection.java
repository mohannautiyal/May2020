package com.home.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {

	public static void main(String[] args) {

	// HashMap insertion order is not preserved	
	Map<Integer,String> stud = new HashMap<Integer,String>();
	stud.put(12, "Raj");
	stud.put(22, "Sohan");
	stud.put(31, "Manoj");
	stud.put(41,"Karan");
	stud.put(15, "Benny");
	stud.put(11, "Shan");

	System.out.println("HashMap -> "+ stud);;
	
	// insertion order is preserved for Linked Hash Map
	Map<Integer,String> stud1 = new LinkedHashMap<Integer,String>();
	stud1.put(12, "Raj");
	stud1.put(22, "Sohan");
	stud1.put(31, "Manoj");
	stud1.put(41,"Karan");
	stud1.put(15, "Benny");
	stud1.put(11, "Shan");	
	System.out.println("Linked Hash Map - > " +stud1);;
	
	// Sorted keys stored
	Map<Integer,String> stud3 = new TreeMap<Integer,String>();
	stud3.put(12, "Raj");
	stud3.put(22, "Sohan");
	stud3.put(31, "Manoj");
	stud3.put(41,"Karan");
	stud3.put(15, "Benny");
	stud3.put(11, "Shan");	
	System.out.println("Tree Map -> "+stud3);;
		
	// Keyset, values and entry set
	
	Set<Integer> stuRollNo =stud3.keySet();
	stuRollNo.stream().forEach(x -> System.out.print(x +" "));
	System.out.println();
	Collection<String> coll = stud3.values();
	coll.stream().forEach(x -> System.out.print(x +" "));
	System.out.println("\n======== Entry Set =========");
	Set<Entry<Integer,String>> stuData = stud3.entrySet();
	//stuData.stream().forEach(x -> System.out.println(x));
	
	stuData.stream().map(x ->x.getKey()+" ").forEach(System.out::print);
	
	
	}

}
