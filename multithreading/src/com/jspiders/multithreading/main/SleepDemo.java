package com.jspiders.multithreading.main;

public class SleepDemo {

	public static void main(String[] args) {
		String msg = "I Am The Guy";
		
		for (int i = 0; i < msg.length(); i++) {
			System.out.print(msg.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
