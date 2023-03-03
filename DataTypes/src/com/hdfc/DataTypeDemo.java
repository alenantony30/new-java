package com.hdfc;
import java.util.Arrays;
import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {
				
		
		String st[]= {"dfd","fdf","sdd","fdfd"};
		
		
		
		System.out.println("Hi, I am Alen Antony");
		
		byte b = 99;
		int i = 130;
		float f=255.7677f;
		
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		
		if(n%256<=127) {
			System.out.println("Coverted = "+n%256+"\nType cast = "+(byte)n);
		}
		else {
			System.out.println("Coverted = "+((256-(n%256))*-1)+"\nType cast = "+(byte)n);
		}
		/*System.out.println("int to byte ="+(byte)i);
		System.out.println("byte to int ="+(int)b);
		System.out.println("int to float ="+(float)i);
		System.out.println("float to int ="+(int)f);
		System.out.println("float to byte ="+(byte)f);*/
		
		
		
	}

}
