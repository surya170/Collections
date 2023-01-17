/**
   ========
   Vector
   ========
   => It is implementation class of List interface.
   => It is a Legacy class
   => Internal Data Structure is growable array.
   => duplicates are allowed
   => insertion order preserved.
   => null values are added.
   => This is synchronized.
   
   => To traverse vector we can use Enumeration as a cursor
   => Enumeration is called as Legacy Cursor .
   
 */
package com.corejava.collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
            Vector<Integer>  v = new Vector<>();
            v.add(10);
            v.add(20);
            v.add(30);
            v.add(null);
            
            System.out.println(v);
            
            Enumeration<Integer> elements = v.elements();
            
            while(elements.hasMoreElements()) {
            	System.out.println(elements.nextElement());
            }
	}

}
