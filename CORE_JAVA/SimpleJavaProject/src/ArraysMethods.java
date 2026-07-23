import java.util.Arrays;

public class ArraysMethods {
	static void line() {
		System.out.println(".....".repeat(10));
	}
	static void space() {
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {4,8,1,9,3,2,7};	//assigning values to the array at the time of creation 
									//it is also known as intializing an arrays
		
		int a[] = new int[7];	  //creating an array of size 7 and allocating the space
								  //in the memory for it
		
		
		line();line();
		System.out.println("Single Dimentional arrays");
		space();
		
//		Storing elements in an array
		
		a[0]=9;		//>
		a[1]=2;		//>>>
		a[2]=4;		//>>>>>		Assigning values to the created array a[]
		a[3]=6;		//>>>>>>>	using the index of array to store the
		a[4]=8;		//>>>>>		elements
		a[5]=3;		//>>>
		a[6]=1;		//>
		
//		to print the elements in an array of any type it will convert to string and printed
		space();line();
		
		System.out.println("printing a[]=" + Arrays.toString(a));
		
		space();line();
		
		System.out.println("printing b[]=" + Arrays.toString(b));
		
		space();line();
		
//		sorting array in ascending order and displaying them
		Arrays.sort(a);
		System.out.println("AfterSort" + Arrays.toString(a));
		
		space();line();
		
//		sorting array in ascending order and displaying them
		Arrays.sort(b);
		System.out.println("AfterSort" + Arrays.toString(b));
		
		space();line();
		
//		binary search of an element which is not in an array a
		int num1 = 33;
		int index1 = Arrays.binarySearch(a, num1);
		if(index1 <= 0) {
			System.out.println("Number " + index1 +" not found in array");
		}else {
			System.out.println("Number " + index1 + " Found in an array");
		}
		
		space();line();
		
//		binary search of an element which is in array b
		int num2 = 4;
		int index2 = Arrays.binarySearch(b, num2);
		if(index2 < 0){
			System.out.println("Number "+ index1 +" not found in array.");
		}else {
			System.out.println("Number "+ index2 + " found in an array");
		}
		
		space();line();
		
//		copying the element of array a to array c upto the a index 7
		int c[] = Arrays.copyOf(a, 7);
		System.out.println("c[] copied from a[] : c[]= " + Arrays.toString(c));
		
		space();line();
		
//		copying the element of array b to array d in between the range of index 2 and 6 = 2,3,4,5
		int d[] = Arrays.copyOfRange(b, 2, 6);// 6 is exclusive the element in index=6 will not print
		System.out.println("d[] copied from b[in between 2<->6 index = 2, 3, 4, 5] :\n d[]= " 
		+ Arrays.toString(d));
		
		space();line();
		
//		checking if array w and array x are equal are not
		int w[] = {1,2,3,4,5,6};
		int x[] = {1,2,3,4,5,6};
		System.out.println("x[] and y[] are equal: " + Arrays.equals(w, x));
		
		space();line();
		
//		checking if array y and array z are equal are not
		int y[] = {1,2,3,4,5,6};
		int z[] = {1,2,3,4,6,8};
		System.out.println("y[] and z[] are equal: " + Arrays.equals(y, z));
		
		space();line();
		
//		filling the array with an element 
		long lis[] = new long[10];
		Arrays.fill(lis, 20);
		System.out.println("lis[] = " + Arrays.toString(lis));
		
		space();space();line();line();
		
		System.out.println("Two (or) Multi Dimentional arrays");
		space();line();
		
		
		//creating a two dimentional array
		int e[][] = new int[3][3];
		
		e[0][0]=1; e[0][1]=2; e[0][2]=3;
		
		e[1][0]=4; e[1][1]=5; e[1][2]=6;
		
		e[2][0]=7; e[2][1]=8; e[2][2]=9;
		

		System.out.println("// two dimentional arrar using for \n values of e[][]: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(e[i][j] + " ");
			}
			System.out.println();
		}

		space();line();

		System.out.println("// two dimentional arrar using deepToString(value) Method \n "
				+ "e[][] = " + Arrays.deepToString(e));
		
		
		space();space();line();line();
		
		System.out.println("Jagged Arrays");
		space();line();
		
		
		

	}

}
