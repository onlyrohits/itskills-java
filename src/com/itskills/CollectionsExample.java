package com.itskills;
import java.util.*;  

public class CollectionsExample {
	public static void main(String[] args) {
		testHashSet();
	}

	public static void testArrayList(){
		
		List<String> list	=	new ArrayList<String>();	//Creating arraylist  
		list.add("Ravi");	//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println(list);  
	}


	public static void testLinkedList(){
		List<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		System.out.println(al);  
	}

	public static void testHashMap(){
		HashMap<String,String> hm=new HashMap<String,String>();  
		hm.put("name","Amit");  
		hm.put("location","Bangalore");  
		hm.put("age","20");  
		
		
		hm.get("age");
		
		System.out.println(hm);  
	}

	public static void testHashSet(){
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");   
		System.out.println(set);  
	}

}

