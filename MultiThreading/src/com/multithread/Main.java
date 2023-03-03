package com.multithread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<3;i++) {
			
			System.out.println(Thread.currentThread().getName()+ " "+i);
			
		}
		
		MyThreads t1=new MyThreads();
		MyThreads t2=new MyThreads();
		MyThreads t3=new MyThreads();
		MyThreads t4=new MyThreads();

		t1.setName("child_1");
		t2.setName("child_2");
		t3.setName("child_3");
		t4.setName("child_4");
		t4.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
