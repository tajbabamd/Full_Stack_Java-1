package JavaEasyBook;

import java.util.Scanner;

public class PracticePg65A {
		/*a program to read n numbers into array and print their sum*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 0;
		
		System.out.println("Enter the element of an array:");
		n = sc.nextInt();
		
		int array[] = new int[n];
		
		for(i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("sum of elements in array = " + sum);
		sc.close();
	}

}
