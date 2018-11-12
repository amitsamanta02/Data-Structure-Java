/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */


package org.amit.ds.list.generic.doubley;

public class DoubleLinkedlistDemo {
    public static void main(String[] args){
        DoubleLinkedList<Integer> dlist = new DoubleLinkedList<Integer>();
        //Add node to the list at the beginning...
       /* dlist.insertAtBeginning(10);
        dlist.insertAtBeginning(90);
        dlist.insertAtBeginning(30);
        dlist.insertAtBeginning(40);
        dlist.insertAtBeginning(20);*/

        //display elements of the list...
        dlist.insertAtEnd(40);
        dlist.insertAtEnd(30);
        dlist.insertAtEnd(50);
        dlist.insertAtEnd(10);
        dlist.insertAtEnd(20);


        dlist.displayNode();
        dlist.deleteNode(40);
        dlist.displayFromlast();
        System.out.println("Total Node Count ="+dlist.count);
    }
}
