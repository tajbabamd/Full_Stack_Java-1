package JavaEasyBook;

public class PracticePg56B {
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
				//print i and set it as i%2 to print odd and even in arow
				System.out.print(i%2 + " ");
			}
			System.out.println();
		}

	}

}
