package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {
	
	static int count =0;
// we can make arraylist class as a thread-safe by passing  array-list object
// to collections. synchronizedList() as parameter
	static ArrayList<Integer> list;
	static List<Integer> synchronizedList;
	static CopyOnWriteArrayList<Integer> copyOnWriteArrayList;
	public static void main(String[] args) throws InterruptedException {
		
		list = new ArrayList<>();
		synchronizedList = Collections.synchronizedList(list);
		
		copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		Thread t1= new Thread(()->{
			for(int i=1;i<=1000;i++) {
				IncrementCounter();
//				copyOnWriteArrayList.add(count++);
				}
		});
		
		Thread t2= new Thread(()->{
			for(int i=1;i<=1000;i++) {
				IncrementCounter();
//				copyOnWriteArrayList.add(count++);
				}
			
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(copyOnWriteArrayList.size());
	}
	private static void IncrementCounter() {
		// TODO Auto-generated method stub
		copyOnWriteArrayList.add(count++);
	}
	 

}
