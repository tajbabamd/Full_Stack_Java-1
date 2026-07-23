import java.util.Scanner;

public class SquareCubeMethods {
	
	static void square() {
		int a, square;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		a = sc.nextInt();
		square = a * a;
		System.out.println("The value of after the Square is: " + square);
		
	}
	
	static void cube() {
		int b, cube;

		Scanner sc = new Scanner(System.in);
 
		
		System.out.println("Enter number: ");
		b = sc.nextInt();
		cube = b * b * b;
		System.out.println("The value of after the Square is: " + cube);
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		square();
		
		System.out.println("...".repeat(20));
		
		cube();
	}
	

}
