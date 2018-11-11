/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.list.generic;

public class SingleLinkedList<T> {
	private Node<T> head ;
	
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
	
	public int removeNode(T data) {
		int count = 0;
		Node<T> current = this.head;
		while (current != null) {
			if (current.getNextNode().getData() == data)
				break;
			current = current.getNextNode();
		}
		return count;
	}
	/*
################ BELOW METHODS ARE ADDED FOR IMPLEMENTATIONS OF STACK DATA STRUCTURE #################
--------------------------------------------------------------------------------------------------------
	*/
	//Push Operations...

	public void insertAtStart(T data){
		Node<T> currentHead = new Node<T>(data);
		currentHead.setNextNode(this.head);
		this.head = currentHead;
	}

	//Remove head/first elements which is needed for POP operation on stack.
	public T removeFirst(){
			Node<T> current = this.head;
			if(current==null){
				System.out.println("Stack is empty.");
				return null;
			}
			else {
				T data = current.getData();
				head = current.getNextNode();
				return data;
			}
	}
	//Top operations..
	public T firstNode(){
		T data = head.getData();
		return data;
	}
	//Is Empty check for Stack...
	public boolean isEmpty(){
		if(head == null)
			return true;
		else
			return false;
	}
	//Total number of stack elements.
	public int getCounts(){
		Node<T> current = head;
		int count =00;
		while(current!=null){
			count++;
			current = current.getNextNode();
		}
		return count;
	}
	/*
	############### STACH IMPLEMENTATION IS ENDED HERE######################
	 */
}
