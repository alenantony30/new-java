package com.runnable;



public class MyRunnable implements Runnable{
	
	public static void main(String args[]) {
		
		MyRunnable r=new MyRunnable();
		Thread td1=new Thread(r);
		td1.setName("Child_1");
		Thread td2=new Thread(r);
		td2.setName("Child_2");
		Thread td3=new Thread(r);
		td3.setName("Child_3");
		td1.start();
		td2.start();
		td3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<3;i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
			
		}
		
		

		
	}
	
	

}
