class Circle{
	
	// state/variables
	public double radius, area;
	
	
}
public class AreaOfCircle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cob = new Circle();
		
		cob.radius = 5;
		cob.area = 3.14 * cob.radius * cob.radius;
		
		System.out.println("Area of a circle= " + cob.area);

	}

}
