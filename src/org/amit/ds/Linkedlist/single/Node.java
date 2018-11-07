package org.amit.ds.Linkedlist.single;

public class Node {
	
	private int data;
	private Node nextNode;
	
//Constructor are declare here.....
	

	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}


	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
