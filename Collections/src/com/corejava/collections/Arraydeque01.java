package com.corejava.collections;

import java.util.ArrayDeque;

public class Arraydeque01 {

	public static void main(String[] args) {
      ArrayDeque<String> ad = new ArrayDeque<>();
      ad.add("one");
      ad.add("Two");
      ad.add("Three");
      ad.addFirst("ashok");
      
      System.out.println(ad);
      ad.pollFirst();
      System.out.println(ad);
      ad.pollLast();
      
      System.out.println(ad);
	}

}
