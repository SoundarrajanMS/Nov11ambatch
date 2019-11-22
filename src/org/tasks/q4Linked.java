package org.tasks;


import java.util.*;

public class q4Linked {
public static void main(String[] args) {
	List<Integer> a =new Vector<>();
	a.add(100);
	a.add(200);
	a.add(300);
	a.add(400);
	a.add(500);
	a.add(600);
	a.add(700);
   

	System.out.println(a);
	/*int b=a.size();
	System.out.println(b);
	  a.add(3,900);
	System.out.println(a);
	a.remove(7);
	System.out.println(a);
	a.set(7,1000);
	System.out.println(a);
	int c= a.indexOf(200);
	System.out.println(c);
	int d=a.lastIndexOf(200);
	System.out.println(d);
	boolean e= a.contains(200);
	System.out.println(e);
	boolean f = a.isEmpty();
	System.out.println(f);*/
	
	List <Integer> a1=new ArrayList<>();
	System.out.println(a1);
	
    a1.add(10);
    a1.add(20);
    a1.add(30);
    a1.add(200);
    a1.add(400);
   System.out.println(a1);
    
   /*a1.addAll(a);
    System.out.println(a1);
    System.out.println(a);
    /*a1.retainAll(a);
    System.out.println(a1);*/
    
    a1.removeAll(a);
    System.out.println(a1);
    
    /*a1.retainAll(a);
    System.out.println(a1);*/
		
	
	}
    

}


