package listfam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static List<Object> list= new ArrayList<Object>();    // good for fetching the data
	
	public static List<Object> list2= new LinkedList<Object>();  // good for insertion and deletion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		list.add(1055);
		list.add(100);
		list.add("Hi");
		list.add(10.25);
		list.add(true);
		list.add(new ListDemo());
		
		

		
		list2.add(1055);
		list2.add(100);
		list2.add("Hi");
		list2.add(10.25);
		list2.add(true);
		list2.add(new ListDemo());
		
		
		
		
		System.out.println(list);
		
		System.out.println(list2);
	}

}
