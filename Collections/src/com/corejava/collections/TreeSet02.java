package com.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
           TreeSet ts = new TreeSet();
           
           ts.add("raja");
           ts.add("ganesh");
           ts.add("ashok");
           
           System.out.println(ts);
           
           Iterator iterator = ts.iterator();
           while(iterator.hasNext()) {
        	   System.out.print(iterator.next()+" ");
           }
           
	}

}
