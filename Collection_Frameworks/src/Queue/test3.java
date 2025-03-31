package com.collection.queue;

import java.util.ArrayDeque;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> deque= new ArrayDeque<>();
		
		deque.add(10);
		System.out.println(deque);
		deque.addFirst(20);
		System.out.println(deque);
		deque.addLast(30);
		System.out.println(deque);
		
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());  
	}

}
