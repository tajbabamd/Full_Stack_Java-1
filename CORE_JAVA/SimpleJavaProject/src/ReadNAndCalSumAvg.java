
import java.util.Scanner;
public class ReadNAndCalSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		int i, n, x, sum = 0;
		double avg;
		System.out.println("Enter n ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			System.out.println("Enter Number:");
			x = sc.nextInt();
			sum = sum + x;
		}
		avg = sum/(double)n;
		System.out.println("sum = " + sum + "  avg = " + avg);
		
		sc.close();



	}

}

		



