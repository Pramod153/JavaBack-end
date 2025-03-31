package com.collection.list;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.capacity());
		
		for(int i=1;i<21;i++) {
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(stack.pop());
		
		Iterator<Integer> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() +" ");
			
		}
		System.out.println();
		stack.remove(1);
		System.out.println(stack);
	}

}
