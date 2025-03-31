package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

// linkedin returns fail-past iterator
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>  linkedList= new LinkedList<>();
		
		// LL used here doublelinked list interface from list interface
		
		// add element
		linkedList.add(12);
		linkedList.add(11);
		
		System.out.println(linkedList);
		
		linkedList.addFirst(30);
		System.out.println(linkedList);
		
		linkedList.addLast(25);
		System.out.println(linkedList);
		
		linkedList.set(1, 100);
		System.out.println(linkedList);
		
		Iterator<Integer> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
//			linkedList.add(1000);
			
			// delete
			Integer pollFirst = linkedList.pollFirst();
			System.out.println(pollFirst);
			
			System.out.println(linkedList);
			
			Integer pollLast = linkedList.pollLast();
			System.out.println(pollLast);
			
			System.out.println(linkedList);
		}
	}

}
