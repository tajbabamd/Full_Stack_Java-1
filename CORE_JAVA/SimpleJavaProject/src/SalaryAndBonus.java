import java.util.Scanner;
public class SalaryAndBonus {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		double salary;
		
		System.out.println("Enter Salary =");
		salary = sc.nextDouble();
		
		if(salary >= 10000.00) {
			System.out.println("Bonus is : " + (0.40 * salary));
		}else if(salary >= 5000.00 && salary <10000) {
			System.out.println("Bonus is : " + (0.30 * salary));
		}else if(salary >=2000 && salary < 5000) {
			System.out.println("Bonus is : " + (0.20 * salary));
		}else {
			System.out.println("Bonus is : " + (0.10*salary));
		}
		
		sc.close();
		
	}

}
