class B{
	
	public static void show(int n) {
		try {
			if(n == 1) {
				System.out.println("No Exception....");
			}else if(n == 2) {
				throw new ArithmeticException("Divide by Zero");
			}else if(n == 3) {
				return ; // terminating method
			}
			
		}catch(ArithmeticException e1) {
			System.out.println("Error: " + e1 );
		}finally {
			System.out.println("Finally executing....");
		}
		
		System.out.println("show() terminating....");
	}
}

public class FinallyDemo {

	public static void main(String[] args) {
		
		B.show(1);
		
		System.out.println("-".repeat(20));
		
		B.show(2);
		
		System.out.println("-".repeat(20));
		
		B.show(3);

	}

}
