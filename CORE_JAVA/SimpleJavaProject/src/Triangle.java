import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double base, height, area;
		
		System.out.println("Enter the base = ");
		base = sc.nextDouble();
		System.out.println("Enter the height = ");
		height = sc.nextDouble();
		
		area = 0.5 * base * height;
		
		System.out.println("Area of a triangle = " + area);

		
		
//		double area, base, height;
//		System.out.println("base = ");
//		base = sc.nextDouble();
//		System.out.println("Enter the height = ");
//		height = sc.nextDouble();		
//		System.out.println("area =" + (0.5 * base * height));
		
		sc.close();
	}
}
