package JavaEasyBook;

import java.util.Scanner;

public class PracticePg51A {
	/*Read a number and print its factor*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.print(" "+i);
			}
		}
		sc.close();
	}

}
