import java.util.Scanner;

public class AddAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Object Creation
		
		Scanner sc = new Scanner(System.in);
		
		//Creating variables
		int a, b, add;
		double avg;
		
		// Read values to variables
		System.out.println("Enter value for a =");
		a= sc.nextInt();
		System.out.println("Enter value for b =");
		b= sc.nextInt();
		
		// Calcualtions
		add=a+b;
		avg=add/2;
		
		// Printing
		System.out.println("addition = " + add);
		System.out.println("average = " + avg);
		
		//closing the keyboard stream
		sc.close();

	}

}
