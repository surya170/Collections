/**
   ==============
   TreeMap
   ==============
   => Implementation class for Map Interface.
   => It maintans Natural sorted order based on keys.
   => Underlying DataStructure is Binary Trees.
   
 */
package com.corejava.collections;

import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args) {
            TreeMap<String,Integer> map = new TreeMap<>();
            map.put("ashok", 101);
            map.put("vamsi", 200);
            map.put("raja",50);
            
            System.out.println(map);
	}

}
