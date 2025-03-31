package com.collection.queue;

import java.util.PriorityQueue;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = { 3, 7,2,1,8,4,9};
		int k=5;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int ele:arr) {
			queue.add(ele);
		}
		
		int counter =0;
		int element =0;
		while(counter!= k) {
			element = queue.poll();
			counter++;
			
		}
		System.out.println(element);
	}

}
