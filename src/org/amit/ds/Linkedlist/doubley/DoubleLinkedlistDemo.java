/*
 * Writer: Amit Samanta
 */

package org.amit.ds.Linkedlist.doubley;

public class DoubleLinkedlistDemo {
    public static void main(String[] args){
        DoubleLinkedList dlist = new DoubleLinkedList();
        //Add node to the list at the beginning...
        dlist.insertAtBeginning(10);
        dlist.insertAtBeginning(90);
        dlist.insertAtBeginning(30);
        dlist.insertAtBeginning(40);
        dlist.insertAtBeginning(20);

        //display elements of the list...
        dlist.displayNode();
    }
}
