/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Stack;

public interface Istack<T> {
    //Push operation on stack.
      void push(T data);

    //Pop operation on
     T pop();

    //Get top element of stack.
     T top();

    //Isempty check.
     boolean isEmpty();

    //Size of stack.
     int size();


}
