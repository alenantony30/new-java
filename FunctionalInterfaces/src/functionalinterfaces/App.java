package functionalinterfaces;

public class App {
	
	public static void main(String args[]) {
		
		ConsumerFunctionalInterface consumerFunctionalInterface
		=(int a ,int b)-> {
			
			System.out.println("Using Consumer Functional Interface --- "+a*b);
		};
		
		SupplierFunctionalInterface supplierFunctionalInterface 
		=()->"Alen";
		
		PredicateFunctionalInterface predicateFunctionalInterface 
		=(int a,int b)-> (a>b);
		
		FunctionFunctionalInterface functionFunctionalInterface
		=(int a,int b)->a+b;
		
		
		
		consumerFunctionalInterface.multiplication(5, 5);
		
		System.out.println("Using Supplier Functional Interface --- "
		+supplierFunctionalInterface.getOwnerName());
		
		System.out.println("Using Predicate Functional Interface --- "
				+predicateFunctionalInterface.isTrue(333, 40));
		
		System.out.println("Using Function Functional Interface --- "
				+functionFunctionalInterface.add(10, 40));
		
	}

}
