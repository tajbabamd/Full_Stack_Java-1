class Math1{
	
	public void add(int x, int y) {
		System.out.println("add1(int-x,y) = " + (x+y));
	}
	
	public void add(int x, int y, int z) {
		System.out.println("add2(int-x,y,z) = " + (x+y+z));
	}
	
	public void add(double x, double y) {
		System.out.println("add(double-x,y) = " + (x+y));
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 80;
		double d1 = 3.55, d2 = 7.33;
		
		Math1 m1 = new Math1();
		
		m1.add(a, b);
		m1.add(a, b, c);
		m1.add(d1, d2);
		
	}

}
