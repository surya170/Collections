package com.corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet02 {

	public static void main(String[] args) {
         
		HashSet<Student> hs  = new HashSet<>();
         hs.add(new Student(101,"Raju"));
         hs.add(new Student(102,"Rani"));
         hs.add(new Student(103,"John"));
         
         Iterator<Student> iterator = hs.iterator();
         while(iterator.hasNext())
         {
        	 System.out.println(iterator.next());
         }
         
	}

}
