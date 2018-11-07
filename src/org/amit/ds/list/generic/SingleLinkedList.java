package org.amit.ds.list.generic;

public class SingleLinkedList<T> {
	private Node<T> head ;
	
	public void insertAtHead(T data){
		Node<T> currentHead = new Node<T>(data);
		currentHead.setNextNode(this.head);
		this.head = currentHead;
	}
	
	public void insertAtEnd(T data){
		Node<T> newNode = new Node<T>(data);
		Node<T> current = head;
		while(current.getNextNode()!=null)
			current = current.getNextNode();
		current.setNextNode(newNode);
	}
	
	public void printNode(){
		Node<T> current = head;
		System.out.println("Current List:-");
		while(current!=null){
			System.out.println(current.getData());
			current = current.getNextNode();
		}
	}
	
	public boolean isPresentNode(T data){
		Node<T> current = this.head;
		while(current != null){
			if(current.getData() == data)
				return true;
			current = current.getNextNode();
		}
		return false;
	}
	
	public int removeNode(T data){
		int count=0;
		Node<T> current = this.head;
		while(current!=null){
			if(current.getNextNode().getData() == data)
				break;
			current = current.getNextNode();
		}
		
		
		
		return count;
	}
	
}
