package com.jspiders.multithreading1.resource;

public class Account {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	public int checkBalance() {
		return balance;
	}
	
	public synchronized void deposite(int amount)
	{
		System.out.println("trying to deposite "+ amount +"rs");
		balance=+amount;
		System.out.println("Successfully added");
		System.out.println("Account balance : "+checkBalance());
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("trying to withdraw "+ amount);
		if (balance>=amount) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.notify();
			
			balance=balance-amount;
			System.out.println(amount + " withdraw successful");
			System.out.println("remaining balance is "+ checkBalance());
			
		} else {
			
			System.out.println("Insufficient Balance");

		}
	}
	
	
}
