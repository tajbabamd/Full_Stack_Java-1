package TestCode;

import java.util.Scanner;

class TestDrive{
	private int a, b, c, i;
	private double d;
	Scanner sc = new Scanner(System.in);
	
	public int setChoice(int i) {
		System.out.println("Enter the choice: ");
		i = sc.nextInt();
		return i;
	}
	
	public int setNum1(int a) {
		System.out.println("Enter the Num1: ");
		a = sc.nextInt();
		return a;
	}
	
	public int setNum2(int b) {
		System.out.println("Enter the Num1: ");
		b = sc.nextInt();
		return b;
	}
	
		
	public int getCalculation() {
		TestDrive t1 = new TestDrive();
		i = t1.setChoice(i);
			
			if( i == 1){
				c = t1.setNum1(a) + t1.setNum2(b);
				System.out.println("Addition = " +c);
			}else if(i == 2) {
				c = t1.setNum1(a) - t1.setNum2(b);
				System.out.println("Subtraction = " + c);
			}else if(i == 3) {
				c = t1.setNum1(a) * t1.setNum2(b);
				System.out.println("Multiplication = " + c);
			}else if(i == 4) {
				d = t1.setNum1(a)/(double)t1.setNum2(b);;
//				c = (int) d;
				System.out.println("Divition = " + d);
			}else {
				System.out.println("Invalid choice");
			}
			return c;
	}
}



public class Test1 {
	
	public static void main(String[] args) {

		TestDrive t = new TestDrive();

		System.out.println("-".repeat(30));
		System.out.println("CALCULATOR");
		System.out.println("-".repeat(30));
		System.out.println("1.ADD");
		System.out.println("2.SUB");
		System.out.println("3.MULT");
		System.out.println("4.DIVI");
		System.out.println("-".repeat(30));
		
		System.out.println(" : " + t.getCalculation());
	}
	
	
}
