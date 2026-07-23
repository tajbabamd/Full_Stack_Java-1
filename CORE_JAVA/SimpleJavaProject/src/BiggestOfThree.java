import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Enter a = ");
		a = sc.nextInt();
		System.out.println("Enter b = ");
		b = sc.nextInt();
		System.out.println("Enter c = ");
		c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("The Biggest is a = " + a);
		} else if(b > c){
			System.out.println("The Biggest is b = " + b);
		} else{
			System.out.println("The Biggest is c = " + c);
		}
		
		sc.close();
	}

}
