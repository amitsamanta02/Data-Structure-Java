/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressionValidation {
    public static void main(String args[]){
        boolean flag = true;
    //Declaring opening and closing bracket of the expression.
        final String opening = "({[";
        final String closing = ")}]";
    //Declaring stack for storing data.
        Stack<Character> stack = new Stack<Character>();

    //Reading data from terminal as an expression input.
        BufferedReader bf = new BufferedReader(new InputStreamReader (System.in));
        try {
            String exp = bf.readLine();
            //Expression validation logic.
            for(char c:exp.toCharArray()){
                if(opening.indexOf(c) !=-1)
                    stack.push(c);
                if(closing.indexOf(c) != -1){
                    char p = stack.pop();
                    if(closing.indexOf(c) != opening.indexOf(p)){
                       flag = false;
                       break;
                    }
                }
            }
            if(flag == true && stack.size() == 0)
                System.out.println("Expression Valid!!!!");
            else
                System.out.println("Expression not a Valid one!!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
