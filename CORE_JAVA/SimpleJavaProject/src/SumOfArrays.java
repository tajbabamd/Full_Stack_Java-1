
public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {15, 9, 12, 4};
		
		
		//sum of array
		int sum=0;
		for(int x : a) {
			sum+=x;
		}
		System.out.print(sum);
		
		System.out.println();
		
		//print ood numbers in array
		
		for (int x : a) {
			if(x%2 == 1) {
				System.out.print(x+" ");
			}
		}
		

	}

}
