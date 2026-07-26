import java.util.Scanner;

interface TriangleDesign{
	
	public void setBase(double base);
	public void setHeight(double height);
	public void calculateArea();
	public double gerArea();
	
}

interface CircleDesign{
	double PI = 3.14; // public static and final by default
	
	public void setRadius(double radius);
	public void calcualteCircleArea();
	public double getCircleArea();
	
}

class Geometry implements TriangleDesign, CircleDesign{
	private double base;
	private double height;
	private double area;
	private double radius;
	private double cArea;
	@Override
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public void calcualteCircleArea() {
		cArea = PI * radius * radius;
	}
	@Override
	public double getCircleArea() {
		return cArea;
	}
	@Override
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void calculateArea() {
		area = 0.5 * base * height;
	}
	@Override
	public double gerArea() {
		return area;
	}	
}

public class Interface2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		TriangleDesign t = new Geometry();
		
//		System.out.println("Enter base :");
//		int a = sc.nextDouble() ;
		t.setBase(5.5);
		
//		System.out.println("Enter height :");
//		int b = sc.nextDouble() ;
		t.setBase(5.5);
		
		t.calculateArea();
		
		System.out.println("Area of triangle = " + t.gerArea());
		
		System.out.println("-".repeat(40));
		
		CircleDesign c = new Geometry();
		
//		System.out.println("Enter radius :");
//		int r = sc.nextDouble() ;
		c.setRadius(5.5);
	
		c.calcualteCircleArea();
		
		System.out.println("Area of Circle: " + c.getCircleArea());
	}

}
