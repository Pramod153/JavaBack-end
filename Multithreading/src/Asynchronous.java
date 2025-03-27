package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class T_A implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return " task completed";
	}
	
}
public class Asynchronous {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();// single Thread Executor
		Future<String> task = newSingleThreadExecutor.submit(new T_A());
		System.out.println(task.get());
		newSingleThreadExecutor.shutdown();
	}

}
