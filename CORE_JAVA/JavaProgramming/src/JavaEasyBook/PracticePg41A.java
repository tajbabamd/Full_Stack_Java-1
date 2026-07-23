package JavaEasyBook;

import java.util.Scanner;

public class PracticePg41A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double length, width, base, height, radius, area;
		int choice;
		
		System.out.println("Calculation of Area Menu.");
		System.out.println("_".repeat(40));
		System.out.println();

		System.out.println("1. Area of Triangle");
		System.out.println("2. Area of Circle");
		System.out.println("3. Area of Rectangle");
		System.out.println("4. Area of Square");
		System.out.println("_".repeat(40));
		System.out.println();
		System.out.println("Enter choice: ");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter base: ");
			base = sc.nextDouble();
			System.out.println("Enter height: ");
			height = sc.nextDouble();
			area = 0.5 * base * height;
			System.out.println("Area of Triangel: " + area);
		
		}else if(choice == 2) {
			System.out.println("Enter radius: ");
			radius = sc.nextDouble();
			area = 3.14 * radius * radius;
			System.out.println("Area of Circle: " + area);
		
		}else if(choice == 3) {
			System.out.println("Enter length:");
			length = sc.nextDouble();
			System.out.println("Enter width: ");
			width = sc.nextDouble();
			area = length * width;
			System.out.println("Area of Rectangle: " + area);
		
		}else if(choice == 4) {
			System.out.println("Enter width: ");
			width = sc.nextDouble();
			area = width * width;
			System.out.println("Area of Square: " + area);
			
		}
		
		sc.close();

	}

}
