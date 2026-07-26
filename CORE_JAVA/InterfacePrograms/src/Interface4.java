/*nested interface*/

interface A{
	interface B{
		public void add(int x, int y);
		public int getAdd();
	}
	public void sub(int n, int m);
	public int getSub();
}

class Math2 implements A, A.B{

	private int x;
	private int y;
	private int n;
	private int m;
	
	@Override
	public void add(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getAdd() {
		return x+y;
	}

	@Override
	public void sub(int n, int m) {
		this.n = n;
		this.m = m;
	}

	@Override
	public int getSub() {
		return n-m;
	}
	
}
public class Interface4 {

	public static void main(String[] args) {
		
		A a = new Math2();
		a.sub(100, 30);
		System.out.println("subtraction = " + a.getSub());
		
		A.B b = new Math2();
		
		b.add(1900, 126);
		
		System.out.println("Addition = " + b.getAdd());

	}

}
