import java.util.Scanner;

public class AddMatrix2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, j, rows, cols;
		
		System.out.println("Enter the number of rows ");
		rows = sc.nextInt();
		
		System.out.println("Enter the number of columsn: ");
		cols = sc.nextInt();
		
		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];
		int[][] c = new int[rows][cols];
		
		System.out.println("Enter elements of matrix a: ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Enter elemens of matric b: ");
		for(i = 0; i < rows; i++) {
			for(j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		for(i=0; i<rows; i++) {
			for(j=0; j<cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Sum of a[i][j] and b[i][j] matrices: ");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
