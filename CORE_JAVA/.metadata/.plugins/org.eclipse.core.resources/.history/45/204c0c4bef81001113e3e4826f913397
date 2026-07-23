package JavaEasyBook;

import java.util.Scanner;

public class PracticePg53A {
	
	/*read n numbers and print their sum and average*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, x, sum = 0, z;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		z = n+1;
		for(i = 1; i <= n; i++) {
			System.out.println("Enter a number "+(--z)+" times: ");
			x = sc.nextInt();
			sum+=x;
		}
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum/(double)n);
		
		sc.close();
	}

}
