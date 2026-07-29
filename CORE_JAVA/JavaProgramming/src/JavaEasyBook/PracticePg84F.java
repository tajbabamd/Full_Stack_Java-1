package JavaEasyBook;

import java.util.Arrays;
import java.util.Scanner;

public class PracticePg84F {
	/* frequency of a number in an array */

	public static int frequency(int a[], int x) {
		int i = 0;
		for (int y : a) {
			if (y == x) {
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		int b[] = { 3, 5, 8, 4, 5, 4, 9, 4 };

		int freq = frequency(b, 4);
		System.out.println("Frequency of 4 in a[]: " + freq);
		freq = frequency(b, 5);
		System.out.println("Frequency of 5 in a[]: " + freq);

		System.out.println("-".repeat(40));
//-----------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements in an array");
		String s = sc.nextLine();

		int a[] = new int[s.length()];

		for (int i = 0; i < a.length; i++) {
			a[i] = Character.getNumericValue(s.charAt(i));
		}

		System.out.println("array a[] : " + Arrays.toString(a));

		System.out.println("Enter the number to check how many times it occured:");
		int c = sc.nextInt();

		freq = frequency(a, c);
		System.out.println("Frequency of " + c + " in a[]: " + freq);

		sc.close();

	}

}
