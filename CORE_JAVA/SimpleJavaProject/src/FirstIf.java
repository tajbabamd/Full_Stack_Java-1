import java.util.Scanner;

public class FirstIf {

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
		} 
		if(b > a) {
			System.out.println("The Biggest is b = " + b);
		}
		if(a == b) {
			System.out.println("Both are Equal:" + a + " = " + b);
		}
		sc.close();
	}

}
