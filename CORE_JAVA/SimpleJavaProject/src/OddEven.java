import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter n = ");
		n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n + " is a Even number");
		} else {
			System.out.println(n + " is a Ood number");
		}
		
		sc.close();
	}

}
