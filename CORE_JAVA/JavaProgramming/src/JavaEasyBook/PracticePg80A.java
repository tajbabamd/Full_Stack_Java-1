package JavaEasyBook;

import java.util.Scanner;

public class PracticePg80A {
		/*calculating area of a triangle using parameterized methods*/
	public static void triangle(double base, double height) {
		double area = 0.5 * base * height;
		System.out.println("area of a triangle: " + area);
	}	
	
	public static void main(String[] args) {
		triangle(44.4, 66.234535);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-".repeat(44));
		System.out.println("Enter base:");
		double base = sc.nextDouble();
		
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		
		triangle(base, height);
		sc.close();
	}

}
