package com.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class T_11 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("t_11 started");
		for(int i=1;i<=10000;i++)continue;
		Thread.sleep(3000);
		return "Task11 completed";
	}
	
}
class T_12 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("t_12 started");
		for(int i=1;i<=5000;i++)continue;
		Thread.sleep(3000);
		return "Task12 completed";
	}
	
}
class T_13 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("t_13 started");
		for(int i=1;i<=7000;i++)continue;
		Thread.sleep(3000);
		return "Task13 completed";
	}
	
}

public class InvokeCall {

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		// TODO Auto-generated method stub
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		List<Callable<String>> asList = Arrays.asList(new T_11(),new T_12(),new T_13());
//		List<Future<String>> results = newFixedThreadPool.invokeAll(asList);
//		for(Future<String> result : results) {
//			System.out.println(result.get());
//		}
		
		String invokeAny = newFixedThreadPool.invokeAny(asList);
		System.out.println(invokeAny);
		newFixedThreadPool.shutdown();
	}

}
