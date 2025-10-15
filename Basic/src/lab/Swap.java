package lab;

public class Swap {

	public static void main(String[] Args) {
		
		int a = 5;
		int b = 10;
		
		System.out.println("Before swap A ="+a+ ",B="+b);
	    
		int temp = a;
		a=b;
		b= temp;
		
		System.out.println("After swap A ="+a+ ",B="+b);
	}
	
}
