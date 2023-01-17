/**
    ========
    Stack
    ========
    => Implementations Class of List Interface
    => Extending From Vector Class
    => Internal Data Structure of Stack is LIFO (last In First out)
    
     push()  ---> to insert object
     peek()  ---> to get last element
     pop()   ----> to remove last element
 */
package com.corejava.collections;

import java.util.Enumeration;
import java.util.Stack;

public class Stack01 {

	public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
         stack.push(10);
         stack.push(20);
         stack.push(30);
         
          Enumeration elements = stack.elements();
          while(elements.hasMoreElements()) 
          {
        	  System.out.println(elements.nextElement());
          }
         
         System.out.println(stack);
         System.out.println(stack.peek()); // get top element
         System.out.println(stack.pop());  // return top element and return that.
         System.out.println(stack);
	}

}
