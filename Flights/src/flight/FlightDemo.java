package flight;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FlightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<FlightDetails> set =new HashSet<FlightDetails>();
		
		set.add(new FlightDetails(123,"Airbus A350",2500));
		set.add(new FlightDetails(125,"Boeing 737",2000.5));
		set.add(new FlightDetails(28,"Airbus A380",3000));
		set.add(new FlightDetails(450,"Boeing 787",1999.9));
		
		System.out.println(set);

		Set<FlightDetails> set2 =new TreeSet<FlightDetails>(new MyComparator());
		
		set2.add(new FlightDetails(123,"Airbus A350",2500));
		set2.add(new FlightDetails(125,"Boeing 737",2000.5));
		set2.add(new FlightDetails(28,"Airbus A380",3000));
		set2.add(new FlightDetails(450,"Boeing 787",1999.9));
		
		System.out.println(set2);
	}
	
}
