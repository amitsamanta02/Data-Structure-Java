/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Queue;

public class QueueDemo {
    public static void main(String args[]){
        Queue<String> q = new Queue<String>();
        q.enqueue("Amit");
        q.enqueue("Anup");
        q.enqueue("Riya");
    //Now see the depth of the queue.
        System.out.println("Depth Now:"+q.depth());
    //Dequeue one by one now.
        System.out.println("Dqueue:"+q.dequeue());
        System.out.println("Dqueue:"+q.dequeue());
        //Now see the depth of the queue.
        System.out.println("Depth Now:"+q.depth());
        System.out.println("Dqueue:"+q.dequeue());
        System.out.println("Dqueue:"+q.dequeue());

        Queue<Integer> qf = new Queue<Integer>();
        //Create logic for a fibo series and insert upto 1000 element on queue.
        int i = 0, cur = 1, prev = 0;
        qf.enqueue(cur);
        while(i < 45){
            int fib = cur + prev;
            qf.enqueue(fib);
            prev = cur;
            cur = fib;
            i++;
        }
       //Dequeue all elements here one by one.
       while(qf.isEmpty() != true){
            System.out.println(qf.dequeue());
       }

    }

}
