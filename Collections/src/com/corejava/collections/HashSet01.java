/**
     =========
        Set
     =========
     => Set is a interface available in java.util.packge
     => Set Interface extending from Collection interface.
     => Set is used to store group of objects.
     => Duplicates Objects are not allowed
     => Supports Homogeneous & Heterogeneous 
     
     =============================
     Set Interface Implementation Class
     ==============================
     => HashSet
     => LinkedHashSet
     => TreeSet
     
     ==============
     HashSet
     ===============
     => Implementation class of Set interface.
     => Duplicates are not allowed 
     => Null is allowed 
     => Insertion order will not be maintained
     => Initial Capacity is 16
     => Load Factor is 0.75
     => Internal DataStrcture is HashTable. 
     
     =============
      Constructors
    ==============
    HashSet hs = new HashSet();
    HashSet hs = new HashSet(int capacity);
    HashSet hs = new HashSet(int capacity,float loadFactor);
    
 */

package com.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {

	public static void main(String[] args) {
       
		HashSet<String> hs = new HashSet<>(100,10.05f);
        
		 hs.add("one");
         hs.add("Two");
         hs.add("Three");
         hs.add("Four");
         hs.add(null);
         hs.add(null);
         hs.add("One");
         
         System.out.println(hs);
         hs.remove("Three");
         System.out.println(hs);
         
         Iterator<String> iterator = hs.iterator();
         while(iterator.hasNext()) 
         {
        	 System.out.println(iterator.next());
         }
         
	}

}
