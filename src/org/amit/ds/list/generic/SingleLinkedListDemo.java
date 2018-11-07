package org.amit.ds.list.generic;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList<String> list = new SingleLinkedList<String>();
		list.insertAtHead("amit");
		list.insertAtHead("Anup");
		list.insertAtHead("Riya");
		list.insertAtHead("Rimi");
		list.insertAtHead("Ritu");
		list.insertAtHead("Rintu");
	
		list.printNode();
		
		if(list.isPresentNode("amit")==true)
			System.out.println("amit is present..");
		else
			System.out.println("Amit is not present..");
		
		
//Added classes for new object type...
		
		SingleLinkedList<DataType> linklist = new SingleLinkedList<DataType>();
		DataType dataType = null;
		dataType = new DataType(100,"amit");
		linklist.insertAtHead(dataType);
		
		dataType = new DataType(200,"anup");
		linklist.insertAtHead(dataType);
		
		dataType = new DataType(300,"riya");
		linklist.insertAtHead(dataType);
		
		dataType = new DataType(400,"xxxx");
		linklist.insertAtEnd(dataType);
		
		linklist.printNode();
	}

}
