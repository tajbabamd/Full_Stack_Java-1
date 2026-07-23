
public class Patern2 { //patern1 program name  RowOrderi.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		
		// for print row order
		
		for(i = 1; i <= 4; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		
		// for printing in the number in row in reverse
		for(i = 1; i <= 4; i++) {
			for(j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		//k logic 
		int k=1;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print("  " + k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println();

		//reminders of odd and even
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print("  " + k%2);
				k++;
			}
			System.out.println();
		}
		
		System.out.println();

		//1 12 123 1234 12345
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("  " + j);
			}
			System.out.println();
		}
		
		System.out.println();

		//1 21 321 4321 54321
		
		for(i = 1; i <= 5; i++) {
			for(j = i; j >= 1; j--) {
				System.out.print("  " + j);
			}
			System.out.println();
		}
		
		System.out.println();

		//1 22 333 4444 55555
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("  " + i);
			}
			System.out.println();
		}
		
	}

}


