import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.println("Enter the age = ");
		age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You are eligible to vote.");
		}else {
			System.out.println("You are not at eligible to vote.");
		}
		sc.close();
	}

}
