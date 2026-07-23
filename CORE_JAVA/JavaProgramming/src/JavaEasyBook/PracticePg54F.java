package JavaEasyBook;

import java.util.Scanner;

public class PracticePg54F {
	/*print perfect numbers between n and m
	 * a positive integer which equals to its sum of its factors is a perfect number*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, i, j, sum;
		boolean isPerfect = false;
		
		System.out.println("Enter a number n: ");
		n = sc.nextInt();
		System.out.println("Enter a number m: ");
		m = sc.nextInt();
		
		for(i = n; i <= m; i++) {
			isPerfect = false;
			sum = 0;
			for(j = 1; j <= i/2; j++) {
				
				if(i%j == 0) {
					sum+=j;
				}	
			}
			if(sum == i) {
				isPerfect = true;
			}
			if(isPerfect) {
				System.out.println(i + " : is a perfect number");
			}
		}	
		
		sc.close();
	}

}
