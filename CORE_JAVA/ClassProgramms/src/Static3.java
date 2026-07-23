
		/*static method can access only static memebers*/
class D{
	private static int x = 10;
	private int y = 20;
	
	public static void print() {
		System.out.println("x = " + x);
//		System.out.println("y = " + y);  it will shoot an error because static method can only 
//		access static members(static variables and static methods)
	}
}

public class Static3 {

	public static void main(String[] args) {
		D ob = new D();
		
		ob.print();
		D.print();

	}

}
