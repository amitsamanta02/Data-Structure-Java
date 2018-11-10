package org.amit.ds.Linkedlist.doubley;

public class Node {

    private int data;
    private Node nextNode;
    private Node prevNode;

    public Node(int data) {
        this.data = data;
    }

    //Getter Methods.
    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    //Setter Methods.
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public void setData(int data) {
        this.data = data;
    }
}
