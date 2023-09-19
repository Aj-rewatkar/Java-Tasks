package com.jspiders.multithreading.thread;

public class MyThread2 implements Runnable{

	@Override
	public void run() {		
	
	
		System.out.println("Thread 2 is running");
		Thread.currentThread().setPriority(8); 
		System.out.println(Thread.currentThread().getPriority());
		
	}

	
	
}
