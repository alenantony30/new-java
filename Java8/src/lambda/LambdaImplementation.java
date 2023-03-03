package lambda;

public class LambdaImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface myInterface =(int a, int b)->{
			
			return(a+b);
			
		};
		
		
		
		System.out.println(myInterface.add(98, 33));
		MyInterface.display();
		
		myInterface.print();

	}

}


