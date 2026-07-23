package JavaEasyBook;

public class PracticePg56D {
		/*a program to print pattern 
		 * [1 0 1 0 1
		 *  0 1 0 1 0 
		 *  1 0 1 0 1 
		 *  0 1 0 1 0 
		 *  1 0 1 0 1]*/
	public static void main(String[] args) {
		
		int i, j, k = 1;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(k%2 + " ");
				k++;
			}
			System.out.println();
		}
	}

}
