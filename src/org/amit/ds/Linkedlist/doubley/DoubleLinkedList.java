/*
 * Writer: Amit Samanta
 */

package org.amit.ds.Linkedlist.doubley;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    public int count = 0;

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
    Add node at the end of the list..
     */

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
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
    /*
    Display element from last to first. <Tail to head>
     */
    public void displayFromlast(){
        Node current = tail;
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
    public boolean deleteNode(int data){
        boolean flag = false;
        Node current = head;
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
        Node current = head;
        while(current != tail){
            System.out.println("Element:"+current.getData());
            current = current.getNextNode();
        }
        //Printing tail elements here....
        System.out.println("Element:"+tail.getData());
    }
}
