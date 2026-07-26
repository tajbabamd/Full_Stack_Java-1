package AbstractClasses;



interface TriangelDesign1{
	
	abstract public void setBase(double base);
	abstract public void setHeight(double height);
	abstract public void calculateArea();
	abstract public double getArea();
	
	default public double gerPI() {
		return 3.14;
	}
}

class TriangleImp1 implements TriangelDesign1{
	private double base;
	private double height;
	private double area;
	
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void calculateArea() {
		area = 0.5 * base * height;
	}
	public double getArea() {
		return area;
	}
	
	
}
public class Interface1 {

	public static void main(String[] args) {
		
		TriangelDesign1 t = new TriangleImp1();
		
		t.setBase(6.5);
		t.setHeight(7.6);
		t.calculateArea();
		
		System.out.println("Area = " + t.getArea());
		System.out.println("PI = " + t.gerPI());

	}

}

