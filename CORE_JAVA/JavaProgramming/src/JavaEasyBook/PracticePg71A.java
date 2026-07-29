package JavaEasyBook;

public class PracticePg71A {
		/*jagged arrays*/
	public static void main(String[] args) {
		
		int a[][] = new int[3][];
		
		a[0] = new int[5];
		a[1] = new int[3];
		a[2] = new int[4];
		
		int i, j, k=1;
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = k*10;
				
				System.out.print("\t" + a[i][j]);//\t is for a space of tab length
				
				k++;
			}
			System.out.println();
		}

	}

}
