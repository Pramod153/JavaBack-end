package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int[] arr2= {2,3,7,8};
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int ele: arr) {
			set.add(ele);
		}
		
		for(int ele: arr2) {
			set2.add(ele);
		}
		
		// to check element aare identical or not
		 boolean result = set.containsAll(set2);
		System.out.println(result);
		
		// union
		set.addAll(set2);
		System.out.println(set);
		
		// intersection
		
		set.retainAll(set2);
		System.out.println(set);
		//
		// difference a-b
		set.removeAll(set2);
		System.out.println(set);
		
	}

}
