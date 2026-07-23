import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, i, sum=0;
		i = 1;
		
		System.out.println("Enter n: ");
		n= sc.nextInt();
		
		while(i <= n) {
			
			if(i%2 == 0) {
			
				sum+=i;
			}	
			
			i++;
			
		}
		System.out.println(sum);
		sc.close();
	}

}
