import java.util.Scanner;

public class SelfThrowOfExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter num1: ");
		a = sc.nextInt();
		
		System.out.println("Enter num2: ");
		b = sc.nextInt();
		
		try {
			//1.identify exception
			if(b == 0) {
				//2. create exception object
				ArithmeticException ex = new ArithmeticException("Divide By Zero");
				//3. throw exception object
				throw ex;
			}
			c = a/b;
			System.out.println("Div= " + c);
		} catch (Exception e1) {
			System.out.println("Error: " + e1);
		}
		
		System.out.println("Program terminating......");

	}

}
