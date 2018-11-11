/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Stack;

public class StackDemo {
    public static void main(String [] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Amit");
        stack.push("Anup");
        stack.push("Riya");
       System.out.println("Total counts:"+stack.size());
        System.out.println("Top Node:"+stack.top());

        System.out.println("Poped Node:"+stack.pop());
        System.out.println("Poped Node:"+stack.pop());
        System.out.println("Poped Node:"+stack.pop());

        System.out.println("Poped Node:"+stack.pop());

    }
}
