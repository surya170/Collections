/**
 * 
   ==============
    TreeSet
   ==============
   
   * it is implementation class of Set interface.
   * Duplicates are not allowed.
   * Null is not allowed.
   * It does not follow insertion order.
   * it will maintain Natural Sorting Order.
   * The internal Data Structure of TreeSet is Binary Tree.
   * It allows only homogeneous values.
   
   Note : When we add null value it will try to compare  null value with previous 
   object then we will get NullPointerException.
   
   Note: TreeSet should perform sorting so always it will compare newly added
   object with old object.In order to compare objects should be of same type.
   
 */
package com.corejava.collections;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
         
		TreeSet ts = new TreeSet();

         ts.add(13);
         ts.add(7);
         ts.add(9);
         ts.add(1);
         //ts.add("hi");
         ts.add(1);
         ts.add(3);
         
         
         System.out.println(ts);
         
	}

}
