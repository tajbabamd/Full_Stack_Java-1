package JavaEasyBook;

import java.util.Scanner;

public class PracticePg35C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		if(n >= 0) {
			System.out.println(n + ": is a Positive number.");
		}
		if(n < 0) {
			System.out.println(n + ": is a Negative number.");
		}
		sc.close();

	}

}
