package com.home.linkedlist;

public class runner {

	public static void main(String[] args) {
		
		linkedlist ll = new linkedlist();
		ll.insertData(10);
		ll.insertData(20);
		ll.insertData(30);
		
		ll.insertAtStart(5);

		ll.show();
		System.out.println("\n");
		ll.insertAt(1, 4);
		ll.show();
		ll.insertAt(2, 0);
		System.out.println("\n");
		ll.show();
		System.out.println("\n");

        ll.delete(6);
		ll.show();

	}
	
	
}
