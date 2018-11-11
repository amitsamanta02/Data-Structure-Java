/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

import org.amit.ds.list.generic.CircularLinkedlist;

public class QueueCircular<T> implements IQueueCircular<T> {

    CircularLinkedlist<T> clist = new CircularLinkedlist<T>();
    @Override
    public void enqueue(T data) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void rotate() {

    }
}
