package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task_A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task_A started" +Thread.currentThread().getName());
		for(int i=1;i<=5000;i++)continue;
		System.out.println("task_A completed"+Thread.currentThread().getName());
	}
	
	
}
class Task_B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task_B started"+Thread.currentThread().getName());
		for(int i=1;i<=500;i++)continue;
		System.out.println("task_B completed"+Thread.currentThread().getName());
	}
	
	
}
class Task_C implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task_C started"+Thread.currentThread().getName());
		for(int i=1;i<=2500;i++)continue;
		System.out.println("task_C completed"+Thread.currentThread().getName());
	}
	
	
}
public class ExecutorFramework {

	public static void main(String[] args) {
		// newSingleThreadExecutor

//		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();// single Thread Executor
//		newSingleThreadExecutor.execute(new Task_B());
//		newSingleThreadExecutor.execute(new Task_A());
//		newSingleThreadExecutor.shutdown();
		
		//newFixedThreadExecutor
		
//		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
//		newFixedThreadPool.execute(new Task_A ());
//		newFixedThreadPool.execute(new Task_B());
//		newFixedThreadPool.execute(new Task_C());
//		newFixedThreadPool.shutdown();
		
		//newCachedThreadPool
		
//		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//		newCachedThreadPool.execute(new Task_A ());
//		newCachedThreadPool.execute(new Task_B());
//		newCachedThreadPool.execute(new Task_C());
//		newCachedThreadPool.shutdown();
		
		// 
		ScheduledExecutorService newScheduledThreadPool =Executors.newScheduledThreadPool(1);
		
		System.out.println("code start to execute");
		newScheduledThreadPool.schedule(new Task_A(), 5000, TimeUnit.MILLISECONDS);
		newScheduledThreadPool.schedule(new Task_B(), 6000, TimeUnit.MILLISECONDS);
		 newScheduledThreadPool.shutdown();
		
		
		
	}
	
}