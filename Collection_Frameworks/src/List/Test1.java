package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		// add objects
		list.add(12);
		list.add(20);
		list.add(13);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		
		// get (index position)
		System.out.println(list.get(2));
		
		System.out.println();
		
		//  using for
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		// enhanced for loop
		for(Integer obj:list) System.out.print(obj+" ");
		
		System.out.println();
		
		// forEach
		
		list.stream().forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		// iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
//			list.add(2,100);
			System.out.print(iterator.next()+" ");
//			list.add(2,100); //throws exception
		}
		System.out.println();
		
		// updation
		list.set(2, 155);
		System.out.println(list);
		
		//remove
		Integer removedObject=list.remove(2);
		System.out.println(removedObject);
		System.out.println(list);
		
	}

}
