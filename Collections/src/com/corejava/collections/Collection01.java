package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection01 {

	public static void main(String[] args) {
           ArrayList<Integer> al = new ArrayList<>();
           al.add(5);	
           al.add(3);
           al.add(1);
           
           System.out.println(al);
           Collections.sort(al);
           System.out.println(al);
           Collections.reverse(al);
           System.out.println(al);
	}

}
