/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 * Mobile No - 98333 274 83
 */

package org.amit.ds.BinaryTree;

public class BinaryTree{

    private Node root;

    BinaryTree(){
        root = null;
    }

    public Node addRecursion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

//Travasal through left and right side of the tree.
        if (data < root.data)
            root.left = addRecursion(root.left, data);
        else if (data > root.data)
            root.right = addRecursion(root.right, data);

        return root;
    }

//Inorder travassal ::  1. goto left node,
//                      2. visit the node,
//                      3. go to right node.

    public void inorder(){
        travasedInorder(root);
    }

    public void travasedInorder(Node root){
        if(root !=null){
            travasedInorder(root.left);
            System.out.println("Val:"+root.data);
            travasedInorder(root.right);
        }
    }

    public void addNode(int data){
        root = addRecursion(root,data);
    }

    public boolean findNode(Node root,int data){
        if(root == null)
            return false;

        if(root.data == data)
            return true;

        if(data > root.data)
            return findNode(root.right,data);
        else if(data < root.data)
            return findNode(root.left,data);
        else
            return false;
    }

    public boolean searchNode(int data){
        return findNode(root, data);
    }

  //preOrder
  //    1. visit node
  //    2. goto leftnode
  //    3. goto right node
    public void preOdersearch(Node root){
        if(root!=null){
            System.out.println("Node Value=>"+root.data);
            preOdersearch(root.left);
            preOdersearch(root.right);
        }
    }

    public void preOrder(){
        preOdersearch(root);
    }

  //postOrder Search

    public void postOrderSearch(Node root){
        if(root!=null){
            postOrderSearch(root.left);
            postOrderSearch(root.right);
            System.out.println("Data->:"+root.data);
        }
    }

    public void postOrder(){
        postOrderSearch(root);
    }

}
