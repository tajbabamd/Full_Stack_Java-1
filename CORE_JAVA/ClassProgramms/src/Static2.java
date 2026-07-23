		/* public static 
		 * here the static variable can be accessed outside the class 
		 * using class name  */

class B{
	public static int x;
}

public class Static2 {

	public static void main(String[] args) {
		
		B.x = 100;
		
		System.out.println("B.x = " + B.x);
		
		B ob = new B();
		
		System.out.println("B.x = " + ob.x);

	}

}
