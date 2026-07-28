class A{
	
	public static void divi(int x, int y) {
		try {
			if(y == 0) {
				ArithmeticException ex = new ArithmeticException("Divide by 0");
				throw ex;
			}
			int z = x/y;
			System.out.println("divi= " + z);
		}catch(Exception e1) {
			System.out.println("Error[divi()]: " + e1);
			throw e1; // Re-throw 
			/*Exception starts from main so the rethrow will sent the exception to main 
			 * for handling there*/
		}
		System.out.println("divi() terminating.....");
	}
}

public class RethrowDemo {

	public static void main(String[] args) {
		
		try {
		 
			A.divi(12, 3);
			A.divi(12, 0); // Re- throw will throw e1 here
		
		}catch(Exception e2) {
			System.out.println("Error[main()]: " + e2);
		}
		
		System.out.println("main() terminating...");

	}

}
