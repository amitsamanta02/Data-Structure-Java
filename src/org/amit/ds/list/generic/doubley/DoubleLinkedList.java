/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */


package org.amit.ds.list.generic.doubley;

public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    public int count = 0;

    /*
    Add logic to add elements in double linked list at the beginning of the list.
     */
    public void insertAtBeginning(T data){
        Node<T> newNode = new Node<T>(data);
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
    Add node at the end of the list..
     */

    public void insertAtEnd(T data){
        Node<T> newNode = new Node<T>(data);
        if(tail!=null){
            newNode.setPrevNode(tail);
            tail.setNextNode(newNode);
            tail=newNode;
        }
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
        }
        count++;
    }

    //Delete element from last..  == dequeue implememtation.
    public T deleteAtLast(){
        T data = null;
        if(tail == null)
            System.out.println("List is empty");
        else{
            data = tail.getData();
            tail = tail.getPrevNode();
            tail.setNextNode(null);
        }
        return data;
    }

    //Delete element from first..  == dequeue implememtation.
    public T deleteAtFirst(){
        T data = null;
        if(head == null)
            System.out.println("List is empty");
        else{
            data = head.getData();
            head = head.getNextNode();
            head.setPrevNode(null);
        }
        return data;
    }

    //Size of the list..
    public int getCount(){
        int count = 1;
        Node<T> current = head;
        if(head == null && tail == null)
            count = 0;
        else
        {
            while(current!=tail){
                count++;
                current = current.getNextNode();
            }
        }
        return count;
    }

    //Get first node of the list..
    public T getFirst(){
       T data;
       if(head==null)
           data = null;
       else
           data = head.getData();

       return data;
    }

    //Get last node of the list..
    public T getLast(){
        T data;
        if(tail==null)
            data = null;
        else
            data = tail.getData();

        return data;
    }

    /*
    Display element from last to first. <Tail to head>
     */
    public void displayFromlast(){
        Node<T> current = tail;
        while(current!=head){
            System.out.println("Node:"+current.getData());
            current = current.getPrevNode();
        }
        //Display head element
        System.out.println("Node:"+head.getData());
    }
    /*
    DELETE A NODE IN DOUBLE LINKED LIST.
    */
    public boolean deleteNode(T data){
        boolean flag = false;
        Node<T> current = head;
        //logic to delete head of the list...
        if(current.getData() == data){
            head = current.getNextNode();
            current.getNextNode().setPrevNode(null);
            flag = true;
            count --;
        }
        //other than head, delete logic for other node..
        else
        {
            while(current.getNextNode() != tail) {
                if (current.getNextNode().getData() == data) {
                    current.getNextNode().getNextNode().setPrevNode(current);
                    current.setNextNode(current.getNextNode().getNextNode());
                    flag = true;
                    count --;
                }
                current = current.getNextNode();
            }
        }
        return flag;
    }
    /*
    Add logic to display elements on Double linked list...
     */
    public void displayNode(){
        Node<T> current = head;
        while(current != tail){
            System.out.println("Element:"+current.getData());
            current = current.getNextNode();
        }
        //Printing tail elements here....
        System.out.println("Element:"+tail.getData());
    }
}
