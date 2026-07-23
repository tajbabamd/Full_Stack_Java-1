import java.util.Scanner;

public class PrintingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter number = ");
		n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(n + " = ONE");
		}else if(n == 2){
			System.out.println(n + " = TWO");
		}else if(n == 3){
			System.out.println(n + " = THREE");
		}else if(n == 4){
			System.out.println(n + " = FOUR");		
		}else if(n == 5){
			System.out.println(n + " = FIVE");
		}else {
			System.out.println("number is out of range");
		}
		
		sc.close();
	}

}
