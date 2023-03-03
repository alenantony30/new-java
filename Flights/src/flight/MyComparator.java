package flight;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		FlightDetails f1=(FlightDetails)o1; 
		FlightDetails f2=(FlightDetails)o2; 
		String s1=f1.getfName(); 
		String s2=f2.getfName(); 
		return s1.compareTo(s2); 
	}
	

	
}
