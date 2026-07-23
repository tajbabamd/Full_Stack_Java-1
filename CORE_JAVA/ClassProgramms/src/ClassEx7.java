
		/*Passing and Returning objects to the methods*/
class CircleArea{
	private double radius, area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}
	
	public void calculateArea() {
		area = 3.14 * radius * radius;
	}
}

class AreaCalculation{
	CircleArea cob = null;
	
	public void setCircle(CircleArea cob) {
		this.cob = cob;
	}
	
	public double calculateCircleArea(double radius) {
		cob.setRadius(radius);
		cob.calculateArea();
		
		double area = cob.getArea();
		
		return area;
	}
}

public class ClassEx7 {

	public static void main(String[] args) {
		AreaCalculation ac = new AreaCalculation();
		CircleArea cob = new CircleArea();
		
		ac.setCircle(cob);
		
		double r = 5.8;
		double area = ac.calculateCircleArea(r);
		
		System.out.println("Area of a Circle : " + area);
		
	}

}
