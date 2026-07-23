package JavaEasyBook;

import java.util.Scanner;

public class PracticePg51E {
	/*a program to read a number and print its odd factorials*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			if(n%i == 0) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
