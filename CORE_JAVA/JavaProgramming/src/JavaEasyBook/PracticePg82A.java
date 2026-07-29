package JavaEasyBook;

import java.util.Scanner;

public class PracticePg82A {
	/*claculating area of a triangle using return type*/
	public static double triangle(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:");
		double base = sc.nextDouble();
		System.out.println("Enter the height:");
		double height = sc.nextDouble();
		
		double a = triangle(base, height);
		System.out.println("Area of a triangle is: " + a );
		System.out.println();
		System.out.println("printed like this");
		System.out.println();
		System.out.println("double a = triangle(base, height);\n"
				+ "System.out.println(\"Area of a triangle is: \" + a );");
		
		//				OR 
		
		System.out.println("-".repeat(40));
		
		System.out.println("Area of a triangle is: " + triangle(base, height));
		System.out.println();
		System.out.println("printed like this");
		System.out.println();
		System.out.println("System.out.println(\"Area of a triangle is: \" +"
				+ " triangle(base, height));");
		
		System.out.println("-".repeat(40));
		
		sc.close();
	}

}
