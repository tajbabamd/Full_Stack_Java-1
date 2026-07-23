import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter the Year =");
		year = sc.nextInt();
		
		if(year%4 == 0) {
			System.out.println("The Year you entered is leap year");
		}else {
			System.out.println("The Year you entered is not leap year");
		}
		sc.close();
	}

}
