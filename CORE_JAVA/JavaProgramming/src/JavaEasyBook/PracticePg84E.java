package JavaEasyBook;

import java.util.Scanner;

public class PracticePg84E {
	/* check if prime or not */

	public static boolean isPrime(int x) {
		if (x <= 1) {
			return false;
		}
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int x = sc.nextInt();

		boolean flag = isPrime(x);

		if (flag == true) {
			System.out.println(x + " is a prime number");
		} else {
			System.out.println(x + " is a not prime number");
		}
		sc.close();
	}

}
