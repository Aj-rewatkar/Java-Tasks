package com.jspiders.multithreading1.thread;

import com.jspiders.multithreading1.resource.Account;

public class Wife extends Thread{
	
public Account account;
	
	public Wife(Account account)
	{
		this.account=account;
		
	}
	
	
	@Override
	public void run() {
		account.deposite(3000);
		account.withdraw(1000);
	}

}
