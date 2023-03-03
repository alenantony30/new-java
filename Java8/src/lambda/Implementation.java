package lambda;

public class Implementation implements MyInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public static void main(String args[]) {
		
		
		MyInterface interface1=new Implementation();
		System.out.println(interface1.add(3,422));
				
	}
	
	

	
	

}
