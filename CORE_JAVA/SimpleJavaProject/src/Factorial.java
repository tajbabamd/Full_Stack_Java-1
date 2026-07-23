import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, n, fact = 1;
		i =1;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		while(i <= n) {
			fact*=i;
			i++;
		}
		System.out.println(fact);
		
		sc.close();
	}

}
