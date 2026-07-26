interface Math1{
	static int sum(int x, int y) {
		return (x+y);
	}
}
public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = Math1.sum(10, 20);
		System.out.println("c = " + c);

	}

}
/*difference between default and static method is that static can be called using class name and default can
 * be called using object name*/
 