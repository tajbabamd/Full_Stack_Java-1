/*nested interface*/

class C{
	interface D{
		public void add1(int x, int y);
		public int getAdd1();
	}
	
}

class Math3 implements C.D{

	private int x;
	private int y;
	
	@Override
	public void add1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int getAdd1() {
		return x+y;
	}
	
}
public class Interface5 {

	public static void main(String[] args) {
		
		C.D a = new Math3();
		a.add1(100, 30);
		System.out.println("Addition = " + a.getAdd1());
		
		
	}

}
