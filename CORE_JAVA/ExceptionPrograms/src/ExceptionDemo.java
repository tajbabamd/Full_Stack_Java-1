import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		try {
			System.out.println("Enter num1:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Enter num2:");
			b = Integer.parseInt(sc.nextLine());

			c = a / b;

			System.out.println("Div= " + c);
			
//		}catch(ArithmeticException e1) {
//			System.out.println("Error1: " + e1);
//		}catch(NumberFormatException e2) {
//			System.out.println("Error2: " + e2);
//		}
				//or
//		}catch(RuntimeException ex) {
//			System.out.println("Error: " + ex);
//		}
				//or
//		} catch (Exception ex) {
//			System.out.println("Error: " + ex);
//		}
				//or
		}catch(Throwable ex) {
			System.out.println("Error: " + ex);
		}

		System.out.println("Program terminating......");

		sc.close();

	}

}
