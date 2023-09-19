package com.jspiders.multithreading.thread;


public class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 1 is running");
		System.out.println(getName());
		this.setPriority(2);
		System.out.println(this.getPriority());
	}
}
