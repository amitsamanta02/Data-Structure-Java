/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

public interface IQueueCircular<T> {
    public void enqueue(T data);

    public T dequeue();

    public int depth();

    public boolean isEmpty();

    public void rotate();
}
