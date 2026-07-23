import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, choice;
		double divi;
		
		System.out.println("CALCULATOR");
		System.out.println("-".repeat(30));
		System.out.println("1.ADD");
		System.out.println("2.SUB");
		System.out.println("3.MULT");
		System.out.println("4.DIVI");
		
		
		System.out.println("Enter Choice");
		choice = sc.nextInt();
		
		System.out.println("Enter num1= ");
		a = sc.nextInt();
		System.out.println("Enter num2= ");
		b = sc.nextInt();
		
			
			if(choice == 1) {
				System.out.println("Addition = " + (a+b));
			}else if(choice == 2) {
				System.out.println("Subtraction = " + (a-b));
			}else if(choice == 3) {
				System.out.println("Multiplication = " + (a*b));
			}else if(choice == 4) {
				divi = a/(double)b;
				System.out.println("Divition = " + divi);
			}else{
				System.out.println("Invalid choice");
			}
		
		sc.close();

	}

}
