package org.amit.ds.Linkedlist.single;

public class SingleLinkedlist {
	private Node head;

//Insert data into the list in head.
	public void insertAtHead(int data){
		Node newnode = new Node(data);
		newnode.setNextNode(this.head);
		this.head = newnode;
	}

//Deletion of Node from the list...
	public boolean deleteNode(int data){
		Node current = this.head;
		while(current.getNextNode() != null){
			if(current.getNextNode().getData() == data){
				Node delete = current.getNextNode();
				current.setNextNode(delete.getNextNode());
				System.out.println("Deleted Node: "+delete.getData());
				return true;
			}
			current = current.getNextNode();
		}
		return false;
	}
	
//DISPLAY ALL THE ELIMENTS OF LIST.
	public void displatList(){
		Node current = this.head;
		System.out.println("List elements are :");
		while(current!=null){
			System.out.println(current.getData());
			current = current.getNextNode();
		}
	}
//GETTING COUNT OF THE LIST.
	public int getCount(){
		int count=0;
		Node current = this.head;
		while(current !=null){
			count = count + 1;
			current = current.getNextNode();
		}
		return count;
	}
//DELETE HEAD NODE ON LIST.
	public void deleteHead() {
		Node newhead = null;
		Node current = this.head;
		newhead = current.getNextNode();
		this.head = newhead;
	}

//Insert data on shorted manner in the list...
	public void insertSortedElement(int data){
		Node newNode = new Node(data);
		if(head == null){
			newNode.setNextNode(this.head);
			this.head=newNode;
		}
		else{
			Node current = this.head;
			if(current.getNextNode() == null){
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
			}
			else{
				while(current != null){
					if(current.getNextNode().getData() > data){
						newNode.setNextNode(current.getNextNode());
						current.setNextNode(newNode);
						break;
					}
					current = current.getNextNode();
				}
			}
			
		}
		
	}
	
	public void sortAList(){
	//Getting number of elements for the list.
		int i = getCount();
		for(i=0;i<6;i++){
			Node current = head;
			while(current.getNextNode() != null){
				if(current.getData() > current.getNextNode().getData()){
				//just swaping data elements here with current and next node if > condition match.
					int temp = current.getData();
					current.setData(current.getNextNode().getData());
					current.getNextNode().setData(temp);
				}
				current = current.getNextNode();
			}
		}
	}

}

