package com.admincutomer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner s= new Scanner(System.in);
		String name;
		
		System.out.println("Enter your name ");
		name=s.nextLine();
		
		System.out.println("1.Customer");
		System.out.println("2.Admin");
		System.out.println("3.exit");
		System.out.println("Enter the choice");
		
		choice = s.nextInt();
		
		switch(choice) {
		
		case 1:
			
			Customer customer=new Customer();
			customer.setCustomerName(name);
			
			Thread t1= new Thread(customer);
			t1.setName(customer.getCustomerName());
			t1.setPriority(1);
			t1.start();
			break;
		case 2:
			Admin admin=new Admin();
			admin.setAdminName(name);
			
			Thread t2= new Thread(admin);
			t2.setName(admin.getAdminName());
			t2.setPriority(2);
			t2.start();
			break;
		case 3:
			
			break;
		
		
	}

}
}
