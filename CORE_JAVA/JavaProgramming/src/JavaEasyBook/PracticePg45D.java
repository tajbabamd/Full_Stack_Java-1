package JavaEasyBook;

import java.util.Scanner;

public class PracticePg45D {
	/*read a number between 1 to 5 and print in words using switch condition statement*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter a number between [1-5]:");
		n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("ONE");
				break;
			case 2:
				System.out.println("TWO");
				break;
			case 3:
				System.out.println("THREE");
				break;
			case 4:
				System.out.println("FOUR");
				break;
			case 5:
				System.out.println("FIVE");
				break;
			default:
				System.out.println("The number "+ n + " is out of range[1 - 5].");
		}
		
		sc.close();

	}

}
