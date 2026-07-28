import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		try {
			System.out.println("Enter num1:");
			a = Integer.parseInt(sc.nextLine());
			System.out.println("Enter num2:");
			b = Integer.parseInt(sc.nextLine());

			try {
				c = a / b;

				System.out.println("Div= " + c);

			} catch (ArithmeticException e1) {
				System.out.println("Error1: " + e1);

			}
		} catch (Exception e2) {
			System.out.println("Error: " + e2);
		}

		System.out.println("Program terminating......");

		sc.close();

	}

}
