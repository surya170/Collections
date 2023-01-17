/**
  ==========
   Map 
  ==========
    => Map is an interface available in java.util package 
    => Map is used to store the data in key-value format 
    => One Key-value pair is called as one Entry.
    => One Map object can have multiple entries
    => In Map Should be unique and values can be duplicate.
    => If we try to store it duplicate key in map it will replace old key data with 
         new key data.
    => We Can take Key & Value as any type of data.
    Example 
      101 - John
      102 - Smith
      103 - Cheerly
    
    => Map interface having several implementation classes.
         1.HashMap
         2.LinkedHashMap
         3.TreeMap
         4.HashTable
         5.IdentityHashMap
         6.WeakHashMap
 
         Methods : 
         
         => put(k,v)         ===> To Store one entry in map object
         => get(k)            ===> To get Value based on key
         => remove(k)    ===>  To Remove one Entry based on key
         => containsKey(k) => To Check  presence of entry base on key.
         => keySet()       ===> To get all keys of the map.
         => values()        ===> To get all values of the map.
         => entrySet       ===> To get all entries
         => clear()          ===> To remove all the entries of map.
         => isEmpty()     ===> To Check weather map object is empty or  not.
         => size()            ===> To get size of the map ( how many entries available).
         
 */
package com.corejava.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
          Map<Integer,String> map = new HashMap<>();
          
          map.put(101, "John");
          map.put(102, "Smith");
          map.put(103, "David");
          map.put(102, "Jell");
          
          System.out.println("Map Size ::: "+map.size());
          System.out.println(map.get(101));
          System.out.println(map.get(300));
          
          Collection<String> values = map.values();
          for(String v : values) 
          {
        	  System.out.println(v);
          }
          
          Set<Integer> keySet = map.keySet();
          for(Integer key : keySet) 
          {
        	 System.out.print(key+" ");
        	 System.out.println(map.get(key));
          }
          
          Set<Entry<Integer, String>> entrySet = map.entrySet();
          Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
          while(iterator.hasNext()) 
          {
        	     Entry<Integer, String> entry = iterator.next();
        	     System.out.println(entry.getKey()+"==>"+entry.getValue());
          }
          
          System.out.println(map.containsKey(102));
          System.out.println(map.containsKey(200));
          System.out.println(map.isEmpty());
          
          System.out.println(map);
          
          map.clear();
          System.out.println(map.size());
          
           
          
	}

}
