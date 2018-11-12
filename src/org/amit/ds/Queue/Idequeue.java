/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

public interface Idequeue<T> {
    public void insertAtBeginning(T data);

    public void insertAtLast(T data);

    public T deleteAtlast();

    public T deleteATBeginning();

    public int size();

    public T getFirst();

    public T getLast();


}
