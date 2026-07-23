import java.util.Scanner;

public class NumberToWordsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter the number [1 - 5] : ");
		n = sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Number is out of range [1 - 5]");
		}
		
		sc.close();
	}

}
