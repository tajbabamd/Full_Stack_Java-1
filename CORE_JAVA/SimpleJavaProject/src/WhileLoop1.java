import java.util.Scanner;

public class WhileLoop1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		char i = sc.next().charAt(0);
		System.out.println("Enter your name ");
		char n = sc.next().charAt(0);
		
		while(i <= n) {
			System.out.print(i + " ");
			i++;
		}
		
		for(i = 0; i <= n; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
