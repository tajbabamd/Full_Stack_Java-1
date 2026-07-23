package JavaEasyBook;

import java.util.Scanner;

public class PracticePg46A {
	/*Write a calculator program using switch statement*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, choice;
		double div;
		
		System.out.println("Calculator menu");
		System.out.println("-".repeat(24));
		System.out.println("1. Addition,");
		System.out.println("2. Substraction,");
		System.out.println("3. Multiplication,");
		System.out.println("4. Divition.");
		System.out.println("-".repeat(24));

		System.out.println("Enter the Choice: ");
		choice = sc.nextInt();
		
		
		switch(choice) {
		case 1:
			System.out.println("Enter the numbers to calculate: ");
			a = sc.nextInt();	b = sc.nextInt();
			c = a + b;
			System.out.println("Addition of a and b is :" + c);
			break;
		case 2:
			System.out.println("Enter the numbers to calculate: ");
			a = sc.nextInt();	b = sc.nextInt();
			c = a - b;
			System.out.println("Substraction of a and b is :" + c);
			break;
		case 3:
			System.out.println("Enter the numbers to calculate: ");
			a = sc.nextInt();	b = sc.nextInt();
			c = a * b;
			System.out.println("Multiplication of a and b is :" + c);
			break;
		case 4:
			System.out.println("Enter the numbers to calculate: ");
			a = sc.nextInt();	b = sc.nextInt();
			div = a /(double) b;
			System.out.println("Divition of a and b is :" + div);
			break;
			
		default:
			System.out.println("The choice is not in the list. Please chose from above list");
		}
		
		sc.close();

	}

}
