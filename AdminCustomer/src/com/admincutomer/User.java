package com.admincutomer;

public class User implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Welcome "+Thread.currentThread().getName());
		if(Thread.currentThread().getPriority()==1) {
			System.out.println("You log in as customer");
		}
		
		else if(Thread.currentThread().getPriority()==2) {
			System.out.println("You log in as admin");
			

		}
	}

}
