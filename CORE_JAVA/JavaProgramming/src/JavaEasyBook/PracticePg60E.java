package JavaEasyBook;

import java.util.Scanner;

public class PracticePg60E {
	/* read a number and print if its perfect number or not usning while loop */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Enter a number n: ");
		n = sc.nextInt();

		if (n == 0) {
			System.out.println(n + " is not considered a Natural number.");
		} else {

			int sum = 0;
			int j = 1;
			while (j <= n / 2) {
				if (n % j == 0) {
					sum += j;
				}
				j++;
			}
			if (sum == n) {
				System.out.println(n + " is a perfect number.");

			} else {
				System.out.println(n + " is not a perfect number.");

			}

		}

		sc.close();
	}

}
