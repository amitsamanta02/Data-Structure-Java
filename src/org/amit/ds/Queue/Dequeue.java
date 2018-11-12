/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

import org.amit.ds.list.generic.doubley.DoubleLinkedList;

public class Dequeue<T> implements Idequeue<T> {

    DoubleLinkedList<T> dlist = new DoubleLinkedList<T>();


    @Override
    public void insertAtBeginning(T data) {
        dlist.insertAtBeginning(data);
    }

    @Override
    public void insertAtLast(T data) {
        dlist.insertAtEnd(data);
    }

    @Override
    public T deleteAtlast() {
        return dlist.deleteAtLast();
    }

    @Override
    public T deleteATBeginning() {
        return dlist.deleteAtFirst();
    }

    @Override
    public int size() {
        return dlist.getCount();
    }

    @Override
    public T getFirst() {
        return dlist.getFirst();
    }

    @Override
    public T getLast() {
        return dlist.getLast();
    }
}
