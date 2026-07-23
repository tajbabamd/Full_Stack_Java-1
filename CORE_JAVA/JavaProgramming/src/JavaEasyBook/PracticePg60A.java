package JavaEasyBook;

import java.util.Scanner;

public class PracticePg60A {
	/*read a number and print it in reverse usning while loop*/

	public static void main(String[] args) {
		int n, m, ld, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		
		m = n;
		while(n > 0) {
			ld = n % 10;
			System.out.print("[ld:"+ld+"] ");
			rev = (rev * 10) + ld;
			System.out.print("[rev:"+rev+"]  ");
			n = n / 10;
			System.out.print("[n:"+n+"] ");
		System.out.println();	
		}
		
		System.out.println("n of " + m + ": " + rev );
		
		sc.close();

	}

}
