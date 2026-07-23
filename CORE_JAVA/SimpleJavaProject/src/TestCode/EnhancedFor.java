package TestCode;

public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 2, 2, 6, 7, 8};
		int sum = 0;
		int val =2, n = nums.length-1;
//		for(int a : nums) {
//			System.out.print(a+" ");
//			sum+=a;
////			System.out.println();
//			System.out.println(" + sum = "+sum);
//			
//		}
		for(int i=0, k=0; i<n; i++, k++) {
			System.out.println(nums[i]+" \\ ");
//			i++;
			if(nums[i] == val ) {
				System.out.println();
				System.out.println("i"+i);
				System.out.println();
			}
			else {
				nums[k]=nums[i];
				System.out.println();
				System.out.println("k"+k);
				System.out.println();
			}
		}
//		while(i <= nums.length-1) {
//			if(nums[i] == nums[val]) {				
//				nums[j++] = nums[i++];
//			}else {
//				nums[k++] = nums[i++];
//			}
//		}

	}

}
