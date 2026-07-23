package JavaEasyBook;

public class PracticePg58F {
	/*a program to print pattern
	 * 1 
	 * 1 0 
	 * 1 0 1 
	 * 1 0 1 0 
	 * 1 0 1 0 1 
	 * System.out.print("* ");*/

	public static void main(String[] args) {
		
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(j%2 + " ");
			}
			System.out.println();
		}

	}

}
