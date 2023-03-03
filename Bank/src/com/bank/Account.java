package com.bank;

public class Account {
	
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Account() {
		super();
	}

	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount) {
			this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) {
		this.balance=this.balance-amount;
		
	}
	

}
