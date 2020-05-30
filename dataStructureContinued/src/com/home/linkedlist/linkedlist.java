package com.home.linkedlist;

public class linkedlist {

	node head;

	// inserting data at the end of the list
	public void insertData(int val) {
		node newnode = new node();
		newnode.value = val;
		if (head == null)
			head = newnode;
		else {
			node n = head;
			while (n.nextNode != null) {
				n = n.nextNode;
			}
			n.nextNode = newnode;
		}
	}

	// displaying the data in the list
	public void show() {
		node n = head;
		while (n.nextNode != null) {
			System.out.print(n.value + " ");
			n = n.nextNode;
		}
		System.out.print(n.value + " ");
	}

	// insert elements at the start of the list

	public void insertAtStart(int val) {

		node n = new node();
		n.value = val;
		if (head == null)
			head = n;
		else {
			node temp = head;
			head = n;
			head.nextNode = temp;

		}

	}

	// insert data at some particular position
	public void insertAt(int pos, int val) {

		if(pos ==1)
			insertAtStart(val);
		else
		{
		node newNode = new node();
		newNode.value = val;
		
		node node = head;
		for (int i = 1; i < pos-1; i++) {
			node = node.nextNode;
		}

		node temp = node.nextNode;
		node.nextNode = newNode;
		newNode.nextNode = temp;
		}
	}

	
// delete from particular position	
	public void delete(int pos) {
		
		node n = head;
		node p =null;
		int currPos=0;
		while(currPos < pos-1 ) {
			p =n;
			n =n.nextNode;
			currPos++;
			}
		
		 if(n.nextNode != null  ) {
		System.out.println("Removed element "+n.value); 

		   n.value = n.nextNode.value;
		   n.nextNode =n.nextNode.nextNode;

		 }else{
			System.out.println("Removed element "+n.value); 
			p.nextNode = null;
		 }
		 
		 
		
	}
	
	
}
