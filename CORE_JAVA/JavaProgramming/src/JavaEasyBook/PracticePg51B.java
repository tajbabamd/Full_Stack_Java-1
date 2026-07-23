package JavaEasyBook;

import java.util.Scanner;

public class PracticePg51B {
	/*print even numbers in b/t n to m number*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, m, i;
		
		System.out.println("Enter the numbers:");
		n = sc.nextInt();
		m = sc.nextInt();
		
		for(i = n; i <= m; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
