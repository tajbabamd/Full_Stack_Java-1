import java.util.Scanner;

public class BonusCalculation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salary;
		
		System.out.println("Enter the Salary: ");
		salary = sc.nextDouble();
		
		if (salary >= 10000.00) {
			System.out.println("The bonus on salary is: " + (0.40 * salary));
		}else {
			System.out.println("The bonus on salary is: " + (0.20 * salary));
		}
		sc.close();
	}
}
