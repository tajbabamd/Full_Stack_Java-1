package JavaEasyBook;

import java.util.Scanner;

public class PracticePg34B {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n+ ": is a Prime number");
		}
		if(n%2 == 1) {
			System.out.println(n+ ": is a Odd number");
		}
		sc.close();
	}
}