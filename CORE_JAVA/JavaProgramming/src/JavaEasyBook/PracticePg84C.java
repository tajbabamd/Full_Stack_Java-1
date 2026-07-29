package JavaEasyBook;

import java.util.Scanner;

public class PracticePg84C {
	/*maximum of two or biggest of two numbers*/
	
	public static boolean max(int x, int y) {
		if(x > y) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = sc.nextInt();
		System.out.println("Enter the number:");
		int y = sc.nextInt();
		
		boolean flag = max(x, y);
		
		if(flag == true) {
			System.out.println(x + " is the Maximum of the two numbers");
		}else {
			System.out.println(y + " is the Maximum of the two numbers");
		}
		sc.close();
	}

}
