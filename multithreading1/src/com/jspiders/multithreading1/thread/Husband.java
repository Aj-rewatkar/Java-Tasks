package com.jspiders.multithreading1.thread;

import com.jspiders.multithreading1.resource.Account;

public class Husband extends Thread{
	
	public Account account;
	
	public Husband(Account account)
	{
		this.account=account;
		
	}
	
	
	@Override
	public void run() {
		account.deposite(5000);
		account.withdraw(2000);
	}

}
