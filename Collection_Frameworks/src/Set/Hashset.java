package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		//add
		
		set.add("arun");
		set.add("anurag");
		set.add("harsh");
		
		System.out.println(set);
		
		set.add("arun");
		System.out.println(set);
		
		set.add(null);
		System.out.println(set);
		
		//traversal
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			set.add("John"); 
		}
		for(String name : set) {
			System.out.println(name);
		}
		set.stream().forEach(System.out:: println);
		
		// contains
		if(set.contains("arun")) {
			set.remove("arun");
		}
		 System.out.println(set);
		
		
	}

}
