package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections01 {	
	public static void main(String[] args) {
		
          List al = new ArrayList();
          al.add(100);
          al.add(200);
          al.add("Raju");
          al.add("Rani");
          al.add(1000.50);
          
          System.out.println("Size Before Removal :: "+al.size());
          al.remove(0);
          System.out.println("Size After Removal ::"+al.size());
          for(Object x : al) 
          {
        	  System.out.print(x+" ");
          }
	}
}
