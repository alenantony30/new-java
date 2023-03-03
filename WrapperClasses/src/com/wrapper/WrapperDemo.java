package com.wrapper;

import static java.lang.System.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class WrapperDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.out.println(Integer.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Byte.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Double.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Character.SIZE/8);

		String a="400";Integer n=899;
		
		System.out.println("\n"+(Float.parseFloat(a)+100));
		out.println((100+n.toString()));
		
		
	
		String str1="Hello";
		String str2="Hello";
		
		System.out.println("Equals   "+str1.equals(str2));
		System.out.println(str1==str2);	
		str2="dsds";
		System.out.println("Equals   "+str1.equals(str2));	
		System.out.println(str1==str2);
		
		String str3=new String("Hello");
		String str4=new String("Hello");
		System.out.println("Equals   "+str3.equals(str4));	
		System.out.println(str3==str4);
		
		
		Integer in1=90;
		Integer in2=90;
		
		System.out.println(in1.equals(in2));
		System.out.println(in1==in2);
		in2=77;
		
		System.out.println(in1.equals(in2));
		System.out.println(in1==in2);
		
		
		Integer in3=new Integer(90);
		Integer in4=new Integer(90);
		
		System.out.println();
		
		System.out.println(in3.equals(in4));
		System.out.println(in3==in4);
		in3=77;
				
		System.out.println(in3.equals(in4));
		System.out.println(in3==in4);    */
		Date date=new Date();
		LocalDate localDate=LocalDate.now();
		
		
		
		System.out.println("Date                     "+date.toString());
		System.out.println("localDate                "+localDate.toString());
		System.out.println("localDate --year         "+localDate.getYear());
		
		LocalDateTime dateTime= LocalDateTime.now();
		
		
		System.out.println("datetime                 "+dateTime);
		System.out.println("dateTime in 12h          "+dateTime.getHour()%12);           // %12 is for getting the time in 12 hours format.
		
		System.out.println("dateTime                 "+dateTime.getMinute());
		
		
		System.out.println("localDate + 45           "+localDate.plusDays(45));              //  for adding 45 days to todays date.
		
		System.out.println("dateTime + 15            "+dateTime.plusDays(15));
	}




}
