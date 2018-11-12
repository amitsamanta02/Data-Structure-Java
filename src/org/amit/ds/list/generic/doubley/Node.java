/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.list.generic.doubley;

public class Node<T> {

    private T data;
    private Node<T> nextNode;
    private Node<T> prevNode;


    public Node(T data) {
        this.data = data;
    }

    //Getter Methods.
    public T getData() {
        return data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    //Setter Methods.
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    public void setData(T data) {
        this.data = data;
    }
}
