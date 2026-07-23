package JavaEasyBook;

import java.util.Scanner;

public class PracticePg38A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double salesAmount, commition;
		
		System.out.println("Enter Sales Amount: ");
		salesAmount = sc.nextDouble();
		
		if(salesAmount >= 5000.00) {
			commition = 0.40 * salesAmount;
		}else {
			commition = 0.20 * salesAmount;
		}
		
		System.out.println("Commition for the ammount '"+ salesAmount + "'sales done is: " + commition);
		sc.close();

	}

}
