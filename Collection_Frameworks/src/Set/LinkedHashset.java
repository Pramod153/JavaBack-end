package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//it maintains insertion order
public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=1;i<=5;i++) {
			set.add(i);
		}
		System.out.println(set);
		set.add(null);
		
		System.out.println(set);
		
		set.add(5);
		System.out.println(set);
		
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
            System.out.println(iterator.next());
//            set.add(6);
            
		}
		for(Integer num : set) {
			System.out.println(num);
		}
		set.stream().forEach(System.out:: println);
		
		// contains
		if(set.contains(2)) {
			set.remove(2);
		}
		 System.out.println(set);
	}

}
