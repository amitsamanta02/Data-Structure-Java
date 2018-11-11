/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Stack;

import org.amit.ds.list.generic.SingleLinkedList;

public class Stack<T> implements Istack<T> {

    SingleLinkedList<T> list = new SingleLinkedList<T>();

    @Override
    public void push(T data) {
        list.insertAtStart(data);
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }

    @Override
    public T top() {
        return list.firstNode();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.getCounts();
    }
}
