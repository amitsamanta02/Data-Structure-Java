package org.amit.ds.Linkedlist.single;

public class SinglrLinkedlistDemo {
	
	public static void main(String args[]){
		SingleLinkedlist list = new SingleLinkedlist();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(60);
		list.insertAtHead(40);
		list.insertAtHead(9000);
		/*list.insertSortedElement(100);
		list.insertSortedElement(900);
		list.insertSortedElement(800);
		list.insertSortedElement(400);
		list.insertSortedElement(300);
		list.insertSortedElement(700);
		list.insertSortedElement(200);*/
		  
		list.displatList();
	// Added logic for delete a node from the list...
		
	//	boolean indicator = list.deleteNode(900);
		//System.out.println("Delete Operation successful:"+indicator);
		
		list.sortAList();
		list.displatList();
		
		System.out.println("Total number of elements in list:"+list.getCount());
		
		System.out.println("Head Deleted....");
		list.deleteHead();
		
		list.displatList();
		
		
		
	}
}
