import java.util.Scanner;

public class PrintOneToTenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, i; 
//		int sum=0;
		
		System.out.println("Enter n: ");
		n = sc.nextInt();
		
		i = 1;
		
		while(i <= n) {
			if(i%2 == 1) {				
				System.out.print(i + " ");
			}
//			sum+=i;
			i++;
		}
//		System.out.println("sum= " + sum);

		sc.close();
	}

}
