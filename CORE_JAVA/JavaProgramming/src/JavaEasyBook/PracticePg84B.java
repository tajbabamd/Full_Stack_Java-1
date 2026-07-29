package JavaEasyBook;

import java.util.Scanner;

public class PracticePg84B {
	/*average of two numbers*/
	
	public static double average(int x, int y) {
		int total = x = y;
		double average = total / 2.00;
		return average;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int x = sc.nextInt();
		
		System.out.println("Enter the number2");
		int y = sc.nextInt();
		
		double z = average(x, y);
		
		System.out.println("Avereage of " + x + " and " + y + " : " + z);
		sc.close();
	}

}
