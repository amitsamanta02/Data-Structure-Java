/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

public class DequeueDemo {

    public static void main(String args[]){
        Dequeue<String> dq = new Dequeue<String>();
//test
        dq.insertAtBeginning("Amit");
        dq.insertAtBeginning("Riya");
        dq.insertAtLast("Rimi");
        dq.insertAtBeginning("Anup");
        dq.insertAtLast(" ");
        dq.insertAtBeginning("Rintu");

        System.out.println("dq-Size:"+dq.size());
        System.out.println("dq-First Node:"+dq.getFirst());
        System.out.println("dq-last Node:"+dq.getLast());

        System.out.println("dq-beginning:"+dq.deleteATBeginning());
        System.out.println("dq-last:"+dq.deleteAtlast());
        System.out.println("dq-beginning:"+dq.deleteATBeginning());
        System.out.println("dq-last:"+dq.deleteAtlast());

        System.out.println("dq-Size:"+dq.size());
        System.out.println("dq-First Node:"+dq.getFirst());
        System.out.println("dq-last Node:"+dq.getLast());
        System.out.println("dq-beginning:"+dq.deleteATBeginning());
        System.out.println("dq-last:"+dq.deleteAtlast());


    }
}
