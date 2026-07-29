package JavaEasyBook;

import java.util.Scanner;

public class PracticePg79A {
	
	public static void add(int x, int y) {
		int z = x = y;
		System.out.println("Addition of x and y is: " + z);
	}
	
	public static void square(int n) {
		int square = n*n;
		System.out.println("Square a number n: " + square);
	}
	
	
	public static void main(String[] args) {	
		add(43, 34);
		square(5);
		System.out.println("-".repeat(30));
		Scanner sc = new Scanner(System.in);
		int a, b, n;
		
		System.out.println("Enter the number:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		add(a, b);
		
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		square(n);
		sc.close();
	}

}
