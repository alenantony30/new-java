package com.multithread;


public class MyThreads extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
	
		
	}

}
