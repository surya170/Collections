/**
       =================
       LinkedList
       ==================
       => Implementation of List Interface
       => Internal data structure is double linked list 
       => Insertion order is preserved
       => duplicates are allowed.
       => null objects also allowed.
       => homogenous & hetrogenous data we can store.
 */
package com.corejava.collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
      LinkedList<Integer> ll = new LinkedList<>();
      ll.add(10);
      ll.add(20);
      ll.add(30);
      ll.add(40);
      System.out.println(ll);
      System.out.println(ll.get(0));
      ll.add(1,15);
      System.out.println(ll);
	}

}
