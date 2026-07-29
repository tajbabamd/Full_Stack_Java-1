package JavaEasyBook;

import java.util.Scanner;

public class PracticePg81C {
	/* printing a message multiple times */
	public static void printMessage(String message, int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print(message + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message:");
		String message = sc.nextLine();
		System.out.println("Enter number of times to print:");
		int n = sc.nextInt();
		printMessage(message, n);
		sc.close();
	}

}
