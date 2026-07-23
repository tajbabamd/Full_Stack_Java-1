
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		int a[] = new int[3];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		
		//initialization of arrays.
		
		System.out.println();
		
		int b[] = {10,20,30};
		for(int i=0; i<3; i++) {
			System.out.print(b[i]+" , ");			
		}
		
		//For each Loop 1
		System.out.println();
		
		for(int x : a) {
			System.out.print(x+" ");
		}
		
		//For each Loop 2 printin sum of an array
		System.out.println();
		
		for(int x : a) {
			sum+=x;
		}
		System.out.print(sum);
		
		//For each Loop 3 printing odd numbers in an array
		System.out.println();
		System.out.println();
		
		int c[] = {8,4,7,6,3,8,9,5,6,5,5,3,5};
		for(int x : c) {
			if(x%2==1)
			System.out.print("odd= "+x+", ");
//			else
//			System.out.println("prime= "+x+", ");
		}
		

	}

}
