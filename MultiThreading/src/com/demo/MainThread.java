package com.demo;

public class MainThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MainThread t1=new MainThread();
		
		System.out.println(t1);
		t1.setPriority(8);
		t1.setName("AlensThread");
		System.out.println(t1);
		System.out.println(Thread.currentThread());
		
		t1.start();

	}
	
	@Override
	public void run() {
		
		System.out.println("Current thread is "+Thread.currentThread().getName());
		System.out.println("run() is executing");
		
	}

}
