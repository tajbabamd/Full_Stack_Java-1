import java.util.Scanner;

public class FirstIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Enter a = ");
		a = sc.nextInt();
		System.out.println("Enter b = ");
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println("The Biggest is a = " + a);
		} else {
			System.out.println("The Biggest is b = " + b);
		}
		
		sc.close();
	}

}
