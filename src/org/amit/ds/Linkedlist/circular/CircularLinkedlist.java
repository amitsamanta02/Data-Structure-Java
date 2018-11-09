package org.amit.ds.Linkedlist.circular;

public class CircularLinkedlist {
	
	private Node tail;

//Insert element in circular list at the beginning...
	public void insertNode(int data){
		if(tail==null){
			Node newnode = new Node(data);
			tail = newnode;
			tail.setNextNode(tail);
		}
		else{
			Node newnode = new Node(data);
			newnode.setNextNode(tail.getNextNode());
			tail.setNextNode(newnode);
		}
	}

//Display elements on Circular list...
	public void displayList(){
		Node current = tail.getNextNode();
		while(current.equals(tail) == false){
			System.out.println("Elements:"+current.getData());
			current = current.getNextNode();
		}
	}
	
}
