package com.corejava.collections;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
      ArrayList<Student> al = new ArrayList<>();
       al.add(new Student(1,"Raju"));
       al.add(new Student(2,"John"));
       al.add(new Student(3,"Smith"));
       al.add(new Student(4,"Rani"));
       
       for(Student s : al) 
       {
    	   System.out.println(s);
       }
       
	}

}
