/**
   ==================
   LinkedHashSet
   ==================
   *  Implementation class for Set interface.
   *  Duplicates are not allowed.
   *  Insertion order will be preserved.
   *  Internal  DataStructure is Hash table + Double LinkedList.
   *  Initial Capacity 16
   *  Load Factory 0.75
   
   Note: HashSet will not maintain insertion order where as LinkedHashSet will maintain insertion order.
             HashSet will follow Hashtable data Structure  where as LinkedHashSet will Follow  
             Hashtable + Double LinkedList data structure.
 */

package com.corejava.collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	public static void main(String[] args) {
        
		 LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
         lhs.add(10);
         lhs.add(20);
         lhs.add(30);
         lhs.add(40);
         lhs.add(null);
         lhs.add(40);
         lhs.add(20);
         
         System.out.println(lhs);
	}

}
