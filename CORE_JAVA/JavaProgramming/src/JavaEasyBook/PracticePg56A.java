package JavaEasyBook;

public class PracticePg56A {
	/*a program to print a pattern 
	 *1 0 1 0 1
	 *1 0 1 0 1
	 *1 0 1 0 1
	 *1 0 1 0 1
	 *1 0 1 0 1  */
	public static void main(String[] args) {
		
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				//print j%2 which is 0 for even and 1 for odd and even = 2 4 and odd = 1 3 5;
				System.out.print(j%2 + " ");
			}
			System.out.println();
		}

	}

}
