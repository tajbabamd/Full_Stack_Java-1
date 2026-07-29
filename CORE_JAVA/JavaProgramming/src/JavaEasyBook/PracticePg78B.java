package JavaEasyBook;

import java.util.Scanner;

public class PracticePg78B {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void abSquare() {
		int a;
		int b;
		int aPlusBWholeSquare;
		
		System.out.println("Enter number a: ");
		a = sc.nextInt();
		
		System.out.println("Enter number b:");
		b = sc.nextInt();
		
		aPlusBWholeSquare = ((a*a) + (b*b) + 2*a*b);
		System.out.println("(a + b)^2 = " + aPlusBWholeSquare);
	}

	public static void main(String[] args) {
		
		abSquare();

	}

}
