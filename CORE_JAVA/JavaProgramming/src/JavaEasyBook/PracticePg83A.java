package JavaEasyBook;

import java.util.Scanner;

public class PracticePg83A {
	/*calculating sum of 1 to n using methods that return value*/
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int x = sum(n);
		System.out.println("sum of 1 to " + n +" : " + x);
			//OR
		System.out.println("sum of 1 to " + n +" : " + sum(n));
		
		sc.close();

	}

}
