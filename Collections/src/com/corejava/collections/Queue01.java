/**
    ========
    Queue
    ========
    => It is extending properties from Collection interface.
    => it is used to store group of objects
    => Internal Data Strcture  is  FIFO ( First in First Out ).
    => it is ordered list of objects.
    => Newly inserted object will be added at the end of the collection.
    => Removal will happen at beginng of the collection.    
 */
package com.corejava.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue01 {

	public static void main(String[] args) {
       PriorityQueue<String> queue = new PriorityQueue<>();
       queue.add("John");
       queue.add("smith");
       queue.add("orlen");
       queue.add("charles");
       
       System.out.println(queue);
       System.out.println(queue.element());
       System.out.println(queue.peek());
     
       Iterator<String> iterator = queue.iterator();   
       while(iterator.hasNext())
       {
    	   System.out.println(iterator.next());
       }
       System.out.println(queue.remove());
       System.out.println(queue.poll());
	}

}
