
public class MethodReturningValue {
	
	static double triangle(double base, double height) {
		
		double area = 0.5 * base * height;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;	//declare variable a of double type 
		a = triangle(2.3, 5.5);	//assign the method call to the variable a 
		System.out.println("area : " + a ); // print the value returned from the method and stored in variable
		
		System.out.println();	//line omitted
		
		System.out.println("area = " + triangle(4.4, 4.6) );//directly print the returned value without assignment.

	}

}
