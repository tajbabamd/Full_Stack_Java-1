package JavaEasyBook;

import java.util.Scanner;

public class PracticePg84D {
	/* reverse a number and check for palindrome */

	public static int reverse(int x) {
		int ld, rev = 0;
		while (x != 0) {
			ld = x % 10;
			rev = (rev * 10) + ld;
			x = x / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int x = sc.nextInt();

		int y = reverse(x);
		if (y == x) {
			System.out.println(y + " is a palindrome of " + x);
		} else {
			System.out.println(y + " is a not a palindrome of " + x);
		}
		sc.close();

	}

}
