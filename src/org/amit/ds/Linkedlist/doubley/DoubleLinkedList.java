/*
 * Writer: Amit Samanta
 */

package org.amit.ds.Linkedlist.doubley;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int count = 0;

    /*
    Add logic to add elements in double linked list at the beginning of the list.
     */
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head != null){
            newNode.setNextNode(head);
            head.setPrevNode(newNode);
            head = newNode;
        }
        if(tail == null && head == null){
            tail = newNode;
            head = newNode;
        }
        count++;
    }
    /*
    Add logic to display elements on Double linked list...
     */
    public void displayNode(){
        Node current = head;
        while(current != tail){
            System.out.println("Element:"+current.getData());
            current = current.getNextNode();
        }
        //Printing tail elements here....
        System.out.println("Element:"+tail.getData());
    }
}
