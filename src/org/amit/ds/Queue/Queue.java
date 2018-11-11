/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

import org.amit.ds.list.generic.SingleLinkedList;

public class Queue<T> implements IQueue<T> {

    SingleLinkedList<T> list = new SingleLinkedList<T>();

    @Override
    public void enqueue(T data) {
        list.insertAtEnd(data);
    }

    @Override
    public T dequeue() {
        return list.removeFirst();
    }

    @Override
    public int depth() {
        return list.getCounts();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
