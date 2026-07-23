import java.util.Scanner;

public class DefaultOrZeroArgumentMethods {
	
	static void add() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		
		c = a + b;
		System.out.println("c= "+c);
		
	}
	
	public static void main(String[] args) {

		
		add();System.out.println();
		add();System.out.println();
		add();System.out.println();
		

	}

}
