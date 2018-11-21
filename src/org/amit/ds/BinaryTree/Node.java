/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.BinaryTree;

public class Node{
     Node left;
     Node right;
     int data;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node  getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

//  A node is created for binary tree here...

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }


}
