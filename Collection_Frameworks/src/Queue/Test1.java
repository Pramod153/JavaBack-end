package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new PriorityQueue<>();
		
		//add
		queue.offer(10);
		queue.offer(12);
		queue.offer(1);queue.offer(10);
		queue.offer(2);
		
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		
		System.out.println(queue.peek());
		
	}

}
