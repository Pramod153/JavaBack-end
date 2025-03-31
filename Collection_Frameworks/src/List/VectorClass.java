package com.collection.list;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector <>();
		System.out.println(vector.capacity());// default 10;
		
		for(int i=1;i<11;i++) {
			vector.add(i);
		}
		System.out.println(vector);
		
		Iterator<Integer> iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
		vector.set(1, 20);
		System.out.println(vector);
		
		System.out.println(vector);
		
		vector.remove(1);
		System.out.println(vector);
		

	}

}
