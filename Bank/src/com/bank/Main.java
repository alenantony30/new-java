package com.bank;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int accNumber=1000001;
		ArrayList<Account> accounts=new ArrayList<Account>();
		accounts.add(new Account(accNumber++,2000,new Person("Smith",45)));
		
		//accNumber=accNumber+1;
		System.out.println(accNumber);
		accounts.add(new Account(accNumber++,3000,new Person("Kathy",45)));
		
		accounts.get(0).deposit(2000);
		accounts.get(1).withdraw(2000);
		
		System.out.println("Smith's account balance is  "+accounts.get(0).getBalance() +" Account number is "+accounts.get(0).getAccNum() );
		System.out.println("Smith's account balance is  "+accounts.get(1).getBalance() +" Account number is "+accounts.get(1).getAccNum() );
		
		System.out.println(accounts.toString());
		

		
		
	}

}
