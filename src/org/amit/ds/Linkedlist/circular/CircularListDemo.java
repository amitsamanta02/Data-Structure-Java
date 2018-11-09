/**
 * 
 */
package org.amit.ds.Linkedlist.circular;

/**
 * @author amitsamanta
 *
 */
public class CircularListDemo {

	public static void main(String[] args) {
		CircularLinkedlist circularList = new CircularLinkedlist();
		circularList.insertNode(10);
		circularList.insertNode(80);
		circularList.insertNode(70);
		circularList.insertNode(60);
		circularList.insertNode(90);
		circularList.insertNode(40);

//Display elements of Circular Linked list...
		circularList.displayList();
		//Getting no of node in circular linked list..
		System.out.println("Total node count before Delete ="+circularList.getCount());

		//Deleting only one element of the list.
		System.out.println("Delete successful:"+circularList.deleteNode(10));

		circularList.displayList();
		System.out.println("Total node count after delete ="+circularList.getCount());

		circularList.rotateList();

		System.out.println("Total node after Rotation");
		circularList.displayList();


	}

}
