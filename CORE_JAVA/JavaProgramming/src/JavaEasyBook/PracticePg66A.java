package JavaEasyBook;

public class PracticePg66A {
		/*Demonstration of for each loop to print array elements*/
	public static void main(String[] args) {
		
		int array[] = {10,20,30,40,50,60,70,80,90};
		
		for(int x:array) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		System.out.println("-".repeat(40));
		
		String arr[] = {"al;skdjf", "lskajdh", "alakssdjfisuhf"};
		
		for(String y : arr) {
			System.out.print(y + " ");
		}
	}

}
