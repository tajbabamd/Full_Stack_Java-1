package JavaEasyBook;

import java.util.Scanner;

public class PracticePg84A {
	/*to check if number is odd or not  using a boolean flag */
	
	public static boolean isOdd(int n) {
			if(n%2 == 1) {
				return true;
			}else {
				return false;
			}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		boolean flag = isOdd(n);
		System.out.println(n + " is odd number ->>" + flag);
		sc.close();
	}

}
