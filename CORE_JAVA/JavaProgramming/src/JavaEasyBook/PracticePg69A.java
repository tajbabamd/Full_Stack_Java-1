package JavaEasyBook;

import java.util.Arrays;
import java.util.Scanner;


public class PracticePg69A {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		
		 System.out.println("Enter number of rows for a:");
		 int rows = sc.nextInt();
		
		 System.out.println("Enter number of cols for a:");
		 int cols = sc.nextInt();

		 int a[][] = new int [rows][cols];
		
		 int b[][] = new int [rows][cols];
		
		 int c[][] = new int [rows][cols];
		 for(int i = 0; i < rows; i++) {
			 for(int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		 }
		 System.out.println();
		 System.out.println("Array of a" + Arrays.deepToString(a));
		 System.out.println();
		
		 for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		 }
		
		 System.out.println();
		 System.out.println("Array of b" + Arrays.deepToString(b));
		 System.out.println();
		
		 for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		 }
		
		 System.out.println();
		 System.out.println("Array of c" + Arrays.deepToString(c));
		
		 sc.close();

		

	}

}


