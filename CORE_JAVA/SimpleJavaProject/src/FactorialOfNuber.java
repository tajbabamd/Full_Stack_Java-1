import java.util.Scanner;

public class FactorialOfNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.println("Enter ");
		n = sc.nextInt();
			
		for(i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.println("1:"+i);
			}
		}
		for(i = 1; i <= n; i++) {
			if(n%i == 0 && i%2 ==0) {
				System.out.println("2:"+i);
			}
		}
				
		sc.close();

	}

}

	


