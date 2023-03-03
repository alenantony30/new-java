package lambda;

public interface MyInterface {


	public int add(int a , int b);
	
	public static void display() {
		
		System.out.println("Display method is called");
	}
	
	public default void print() {
		
		System.out.println("print method is called");
	}
}
