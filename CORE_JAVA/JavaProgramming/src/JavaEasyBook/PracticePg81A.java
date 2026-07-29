package JavaEasyBook;

import java.util.Scanner;

public class PracticePg81A {
	/*circle calculation area and parimeter*/
	
	public static void circle(double radius) {
		double area = 3.14 * radius * radius;
		System.out.println("Area of the circle for ["+ radius +"]:" + area + " cm²");
	}
	public static void parimeter(double radius) {
		double parimeter = 2 * 3.14 * radius;
		System.out.println("Parimeter of a circle for["+ radius +"]:" + parimeter+ " cm");
	}
	
	
	public static void main(String[] args) {
		
		circle(55.5);
		parimeter(44.3);
		
		System.out.println("-".repeat(44));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius in centemeters:");
		double radius = sc.nextDouble();
		
		circle(radius);
		parimeter(radius);
		
		sc.close();

	}

}
