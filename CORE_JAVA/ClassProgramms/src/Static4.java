
		/*public static methods are utility methods that takes values and returns 
		 * results without storing values*/

class Math1{
//	static int x, y;
	public static int add(int a, int b) {
//		x = a;
//		y = b;
//		int z = x + y;
		int z = a + b;
		return z;
	}
}

public class Static4 {

	public static void main(String[] args) {
		int c = Math1.add(10, 20);
		System.out.println("c = " + c);

	}

}
