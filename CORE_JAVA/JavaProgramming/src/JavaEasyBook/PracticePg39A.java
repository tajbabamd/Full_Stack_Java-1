package JavaEasyBook;

import java.util.Scanner;

public class PracticePg39A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter number between [1-5]: ");
		n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("ONE");
		}else if(n == 2) {
			System.out.println("TWO");
		}else if(n == 3) {
			System.out.println("THREE");
		}else if(n == 4) {
			System.out.println("FOUR");
		}else if(n == 5) {
			System.out.println("FIVE");
		}else {
			System.out.println("Number out of [1 - 5] range.");
		}
		sc.close();

	}

}
