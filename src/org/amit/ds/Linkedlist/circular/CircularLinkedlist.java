package org.amit.ds.Linkedlist.circular;

public class CircularLinkedlist {
	
	private Node tail;

//Insert element in circular list at the beginning...
	public void insertNode(int data){
		if(tail==null){
			Node newNode = new Node(data);
			tail = newNode;
			tail.setNextNode(newNode);
		}
		else{
			Node newNode = new Node(data);
			newNode.setNextNode(tail.getNextNode());
			tail.setNextNode(newNode);
		}
	}

//Display elements on Circular list...
	public void displayList(){
		Node current = tail;
		if(tail == null) {
            System.out.println("List is empty.");
            return;
        }
		System.out.println("Elements:"+current.getData());
		current = current.getNextNode();
		while(current.equals(tail) == false) {
			System.out.println("Elements:" + current.getData());
			current = current.getNextNode();
		}
	}
	//Get counts of the list.
	public int getCount(){
		if(tail == null)
			return 0;
		else{
			Node current = tail;
			int count = 1;
			while(current.getNextNode().equals(tail) == false){
				count++;
				current = current.getNextNode();
			}
			return count;
		}
	}
	//Delete of a node in circular linked list.

	public boolean deleteNode(int data){
		boolean flag = false;
		//This if block will execute if list has only one element...
		if(tail.getData() == data && tail.getNextNode() == tail){
			tail = null;
			flag= true;
		}
		else{
			Node current = tail;
			while(current.getNextNode().equals(tail) == false){
				if(current.getNextNode().getData() == data){
					current.setNextNode(current.getNextNode().getNextNode()); // removing link for middle node whose data match with delete node.
					flag = true;
				}
				current = current.getNextNode();
			}
			//This part of of logic execute when tail node has to be deleted and list has more than one element;
			if(tail.getData() == data){
				current.setNextNode(tail.getNextNode());
				tail = tail.getNextNode();
				flag = true;
			}

		}
		return flag;
	}
	
}
