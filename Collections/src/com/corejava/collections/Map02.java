package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map02 {

	public static void main(String[] args) {
		
        Student s1 = new Student(101,"John");
        Student s2 = new Student(102,"Smith");
        Student s3 = new Student(103,"Orlen");
        
        Map<Integer,Student> map = new HashMap<>();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
       /* 
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet) 
        {
        	System.out.print(key+"===>");
        	System.out.println(map.get(key));
        }
        */
        
          Set<Entry<Integer,Student>> entrySet = map.entrySet();
          for(Entry<Integer,Student> entry : entrySet) 
          {
        	  System.out.print(entry.getKey()+"====>");
        	  System.out.println(entry.getValue());
          }
        
        System.out.println(map);
        System.out.println(map.containsKey(4));
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
	}

}
