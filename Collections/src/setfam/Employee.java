package setfam;

import java.util.*; 
class Employee implements Comparable { 
	
	String name; 
	int eid; 
	
	Employee(String name,int eid) { 
	
		this.name=name; 
		this.eid=eid; 
		
	} 
	public String toString() { 
		

		return " [ "+name+","+eid+" ] "; 
		//return "Hello";

	} 

	@Override
	public int compareTo(Object o) {
		String eid1=this.name;
		String eid2=((Employee)o).name; 
		//System.out.println(eid1+" and "+eid2);
		
		return this.name.compareTo(((Employee)o).name);
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	} 
	
	
	
} 