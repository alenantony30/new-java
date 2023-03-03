package setfam;

import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Object> tree1=new TreeSet<Object>();
		
		tree1.add(1);
		tree1.add(2);
		tree1.add(22);
		tree1.add(652);
		tree1.add(23);
		tree1.add(3);
		tree1.add(22);
		tree1.add(1);
		
		System.out.println(tree1);
		
		Set<Employee> tree2=new TreeSet<Employee>(new MyComparator());
		
		Employee e=new Employee("Alen",99);
		tree2.add(e);
		e=new Employee("Sam",33);
		tree2.add(e);
		e=new Employee("Zen",22);
		tree2.add(e);
		e=new Employee("Akash",7);
		tree2.add(e);
		e=new Employee("Akshay",9);
		tree2.add(e);
		
		System.out.println(tree2);
		
		

	}

}
