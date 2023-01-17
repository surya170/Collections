package com.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList02 {

	public static void main(String[] args) {
          ArrayList al = new ArrayList();
          al.add(10);
          al.add(20);
          al.add(30);
          al.add(40);
          
          System.out.println("====== For Loop Approach");
          // Approach  -1 
          for(int i=0;i< al.size();i++) {
        	   System.out.println(al.get(i));
          }
          System.out.println("====== For-Each  Approach=========");
          // Approach - 2
          for(Object obj : al) {
        	  System.out.println(obj);
          }
          System.out.println("======= Iterator Approach   =========");
         // Approach - 3
          Iterator itr =  al.iterator();
          while(itr.hasNext()) {
        	  System.out.println(itr.next());
          }
          System.out.println("=======listIterator Approach   =========");

         // Approach - 4 
          ListIterator listIterator = al.listIterator();
          while(listIterator.hasNext()) {
        	  System.out.println(listIterator.next());
          }
          // Approach-5
          System.out.println("======= ForEach() Method Approach   =========");
           al.forEach(i -> {
        	    System.out.println(i);
           });
        
	}

}
