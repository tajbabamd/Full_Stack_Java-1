package JavaEasyBook;

import java.util.Scanner;

public class PracticePg60D {
	/*read a number and print if its prime number or not usning while loop*/

	public static void main(String[] args) {
		int n;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		n = sc.nextInt();
		
			int i = 2;
			while(i <= n/2) {
				if(n%i == 0) {
					isPrime = false;
					i++;
				}
				i++;
			}
			
			if(isPrime && n > 1) {
				System.out.println(n +" is a prime number");
			}else {
				System.out.println(n +" is not a prime number");
			}
			
		sc.close();
	}
}
