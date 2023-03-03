package flight;

import java.util.Objects;

public class FlightDetails {

	private int fId;
	private String fName;
	private double tPrice;
	public int getfId() {
		return fId;
	}
	public String getfName() {
		return fName;
	}
	public double gettPrice() {
		return tPrice;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void settPrice(double tPrice) {
		this.tPrice = tPrice;
	}
	public FlightDetails(int fId, String fName, double tPrice) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.tPrice = tPrice;
	}
	public FlightDetails() {
		super();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(fId);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return " [ "+this.fId+" "+this.fName+" "+this.tPrice+" ]\n ";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println(obj);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightDetails other = (FlightDetails) obj;
		return fId == other.fId;
	}
	
	
	
	
	
}
