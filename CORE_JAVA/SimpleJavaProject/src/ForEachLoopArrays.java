
public class ForEachLoopArrays {
	
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for loop for printing single dimensional arrays
		int[] a = new int [3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(a[i]+" ");
		}
		
		space();
		
//		for each loop for printing single dimensional arrays
		
		for(int x : a) {
			System.out.println(x + " ");
		}
		
		space();
		
		int[][] b = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
//		for loop for printing two dimensional arrays
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(b[i][j]+" ");
			}
			space();
		}
		space();
//		for each loop for printing two dimensional arrays
		
		for(int row[] : b) {
			for(int col : row){
				System.out.println(col+" ");
			}
			space();
		}
	}

}
