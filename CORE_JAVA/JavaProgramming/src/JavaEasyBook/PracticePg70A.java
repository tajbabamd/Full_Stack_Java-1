package JavaEasyBook;

public class PracticePg70A {
		/*for each loop to print 2d array*/
	public static void main(String[] args) {
		
		int matrix[][]= {{10,20,30},
				{40,50,60}
		};
		
		for(int row[]: matrix) {
			for(int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
