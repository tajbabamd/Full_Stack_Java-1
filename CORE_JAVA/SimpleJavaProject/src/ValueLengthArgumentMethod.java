import java.util.Arrays;

public class ValueLengthArgumentMethod {
	
	static int add(int... nums) {
		int sum = 0;
		
		for(int x : nums) {
			System.out.print(x + " ");
			sum+=x;
		}
		int a[] = nums;
		System.out.println("\nnums[] = "+ Arrays.toString(a));
		System.out.println();
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = add(1,2,3,4,5,6,7,8,9,10);
		System.out.println("sum = " + s);

	}

}

//	OUTPUT	
//	1 2 3 4 5 6 7 8 9 10 
//	nums[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//
//	sum = 55


//	Terminologies 
//	here add()  is a method name
//	add(int... nums) is a variable length argument which stores the multiple values passed to it as an array

