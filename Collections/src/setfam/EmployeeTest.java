package setfam;

import java.util.TreeSet;

public class EmployeeTest  {
	 
	 public static void main(String[] args) { 

		 TreeSet<Employee> t1=new TreeSet<Employee>(); 
		 t1.add(new Employee("Sam",200)); 
		 t1.add(new Employee("Alen",100)); 
		 t1.add(new Employee("Zen",50)); 
		 t1.add(new Employee("Arun",150)); 
		 t1.add(new Employee("Akshay",1200)); 
		 t1.add(new Employee("Akshay",1200)); 
		 t1.add(new Employee("Akshay",1200)); 
		 System.out.println(t1);
		 
		 TreeSet<Employee> t2=new TreeSet<Employee>(new MyComparator());
		 
		 t2.add(new Employee("Alen",100)); 
		 t2.add(new Employee("Sam",200)); 
		 t2.add(new Employee("Zen",50)); 
		 t2.add(new Employee("Arun",150)); 
		 t2.add(new Employee("Akshay",100)); 
		 t2.add(new Employee("Akshay",100)); 
		 t2.add(new Employee("Akshay",100)); 
		 System.out.println(t2);
	 }
} 

