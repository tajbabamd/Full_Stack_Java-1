package JavaEasyBook;

import java.util.Scanner;

public class PracticePg78A {
		/*default methods */
	static Scanner sc = new Scanner(System.in);
	//default method 1 for triangle area
	public static void areaOfTriangle() {
		double base;
		double height;
		double area;
		
		space();
		System.out.println("Method areaOfTriangle started....");
		
		System.out.println("Enter base:");
		base = sc.nextDouble();
		System.out.println("Enter height:");
		height = sc.nextDouble();
		
		area = 0.5 * base * height;
		
		System.out.println("Area of a triangle: " + area);
		
		System.out.println("Method areaOfTriangle terminated.....");
		space();
	}
	//default method 2 for Circle area
	public static void areaOfCircle() {
		double radius;
		final double PI = 3.14;
		double area;
	
		space();
		System.out.println("Method areaOfCircle started....");
		System.out.println("Enter radius:");
		radius = sc.nextDouble();
		
		area = PI * radius * radius;
		
		System.out.println("Area of a circle: " + area);
		System.out.println("Method areaOfCircle terminated.....");
		space();
	
	}
	
	//default method 3 for spacing
	public static void space() {
		System.out.println();
		System.out.println("-".repeat(40));
	}
	public static void main(String[] args) {
		
		areaOfTriangle();
		areaOfCircle();
		
		sc.close();
	}

}
