/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.BinaryTree;

public class BinaryTreeDemo {

    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();

        for(int i= 0;i<40;i++)
            bt.addNode(i);

        System.out.println("Inorder Search:");
        bt.inorder();

        System.out.println("PreOrder Search:");
        bt.preOrder();

        System.out.println("PostOrder Search:");
        bt.postOrder();


        System.out.println("3999 present on tree ->"+bt.searchNode(3999));



    }
}
