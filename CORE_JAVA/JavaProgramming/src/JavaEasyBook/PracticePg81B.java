package JavaEasyBook;

import java.util.Scanner;

public class PracticePg81B {
	/*the biggest number of two using parameterizec methods*/
	
	public static void biggest(long x, long y) {
		if(x > y) {
			System.out.println(x + " is the biggest of "+ x + " and "+ y );
		}else {
			System.out.println(y + " is the biggest of "+ x + " and "+ y );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		biggest(x, y);
		
		sc.close();
		

	}

}
