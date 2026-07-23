

import java.util.Scanner;

public class VowelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter alphabet: ");
		ch = sc.next().charAt(0);
		
//		System.out.println("ch = " + ch);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is Vowel");
		else
			System.out.println(ch + " is Consonent");
		
		sc.close();

	}

}
