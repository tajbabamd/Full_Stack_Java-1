package JavaEasyBook;

import java.util.Scanner;

public class PracticePg34A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		
		if(a > b) {
			System.out.println(a+" :a is the biggest");
		}
		if(b > a) {
			System.out.println(b+" :b is the biggest");
		}
		sc.close();

	}

}
