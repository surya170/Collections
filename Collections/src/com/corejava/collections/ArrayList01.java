/**
 
   ===========
    ArrayList
   ===========
   
   * Implementation class of List Interface 
   => Duplicate Objects are allowed.
   => Insertion Order  Preserved.
   => Null values are accepted.
   => Internal data structure of ArrayList is growable array.
   => Default Capacity is 10
   
   ===============
    Constructors
    ===============
    * ArrayList al = new ArrayList();    // if we don't know the size go for these.
    * ArrayList al = new ArrayList(int capacity);
    * ArrayList al = new ArrayList(Collection c);
   
    ================
     Methods 
    ================
     0. add(int index,Object obj); // add object at given index , performance wise is bad
     1. add(Object obj);   // To add one object at end of the collection
     2. addAll(Collection c); // To add some objects at end of the collection
     3. remove(Object obj);   // To Remove object based on the given object.
     4. remove(int index);   // To remove object based on the given index.
     5. get(int index);  
     6. contains(Object obj);  // To Check the presence of the object
     7. clear();     // To remove all objects from collection
     8. isEmpty();  //  To check collection is Empty or not.
     9. retainAll(Collection c);  // Keep Only these (some)  object and remove all.
    10. indexOf(Object obj)
    11. lastIndexOf(Object obj) 
    12. set(int index,Object obj)   // If we want to replace at specific we go for set(); 
    13. iterator(); //  it support only in Forward Direction
    14. listIterator(); //  It Supports both in Forward and Backward Direction. 
 **/

package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
         List<Integer> al = new ArrayList<Integer>();
         al.add(100);
         al.add(200);
         al.add(300);
         al.add(400);
         al.add(1000);
         
         // insertion order is mainted
         System.out.println(al);
         
         // ArrayList 
         al.add(0,50);
         System.out.println(al);
         al.add(3, 700);
         System.out.println(al);
         al.set(0, 60);
         System.out.println(al);
         
         System.out.println(al.contains(800));
         System.out.println(al.get(6));
         al.add(100);
         System.out.println(al);
         al.add(null);
         System.out.println(al);
         
         System.out.println(al.indexOf(100));  // 1
         System.out.println(al.lastIndexOf(100));  // 7
         
         al.remove(0);
         System.out.println(al);
         
         System.out.println(al.indexOf(100));  // 0 
         System.out.println(al.lastIndexOf(100)); // 6
         System.out.println(al.indexOf(4444));  // -1 index is not availiable
         System.out.println(al.size());

         al.clear();
         System.out.println(al);
         
         List l1 = new ArrayList();
          l1.add(10);
          l1.add(20);
          l1.add(30);
          
        List l2 = new ArrayList();
           l2.add(40);
           l2.add(50);
           l2.add(10);
          l2.addAll(l1);
        
        System.out.println(l2);
        //l2.addAll(0, l1);
        System.out.println(l2);
        l2.retainAll(l1);
        System.out.println(l2);
        
	}

}
