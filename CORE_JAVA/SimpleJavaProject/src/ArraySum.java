import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n, i, sum=0;
		
		System.out.println("Enter the number");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter "+ n + " numbers");
		for(i =0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Elements in array:");
		for(i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
			sum+=arr[i];
//			System.out.println();
		}
		System.out.println("\nsum of arr[" + n +"]: " + sum);
		
		sc.close();

	}

}
