import java.util.Scanner;

public class AreaOfTriangle {
	
	// Finding the area of a triangle multiple times using a method
	public static void area() {
		
			
		Scanner sc = new Scanner(System.in);
		
		double base, height, area;
		
		System.out.println("Enter the base = ");
		base = sc.nextDouble();
		System.out.println("Enter the height = ");
		height = sc.nextDouble();
		
		area = 0.5 * base * height;
		
		System.out.println("Area of a triangle = " + area);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		area();
		System.out.println("-");
		area();
		System.out.println("-");
		area();
		System.out.println("-");
		area();

	}

}
