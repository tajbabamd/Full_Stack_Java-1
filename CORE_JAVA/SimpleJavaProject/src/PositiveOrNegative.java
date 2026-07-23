import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter n = ");
		n = sc.nextInt();
		
		if(n >= 0) {
			System.out.println(n + " n is a positive number");
		} else {
			System.out.println(n + " n is a negative number");
		}
		
		sc.close();
	}

}
