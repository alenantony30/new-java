package synchronization;

public class Admission implements Runnable {

	static int seats = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admission admission = new Admission();
		
		Thread t1 = new Thread(admission,"Alen");
		Thread t2 = new Thread(admission,"Arun");
		
		System.out.println("Total Number of seats available "+seats+"\n");
		
		t1.start();
		t2.start();
		
		

	}

	
	@Override
	public synchronized   void  run() {
		
		
		if(seats>0) {
			
			System.out.println("Seat is alloctaed to "+Thread.currentThread().getName());
			seats--;
			System.out.println("Number of available "+seats+"\n");
			try {
			Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		}
		
		else {
			System.out.println("Sorry "+Thread.currentThread().getName()+", seats are filled");
		}
		
	}
	
}
