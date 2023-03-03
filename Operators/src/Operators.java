import java.util.*;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the case");
		int ch;
		Scanner s= new Scanner(System.in);
		/*ch=s.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("0");
			break;
		
		}*/
		
		int ar[]= {1,2,3,4,5};
		int ar2[][]=new int[5][5];
		int c=0;
		System.out.println(ar+" "+ar2);
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				c++;c++;
				ar2[i][j]=c;
			}
		}
		
		for(int x:ar2[2])
			System.out.print(x+ " ");
		
		System.out.println();
		int cn=0;
		while(cn<=5)
		{
			System.out.print(cn+" ");cn++;
		}
		System.out.println();
		
		do {
			System.out.print(cn+" ");cn++;
		}while(cn<=5);
	}
	


}
