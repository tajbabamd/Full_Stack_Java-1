

import java.util.Scanner;

public class StudentProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name, result, grade;
		int rollno, sub1, sub2, sub3, total;
		double avg;
		
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter rollno:");
		rollno = sc.nextInt();
		System.out.println("Enter sub1:");
		sub1 = sc.nextInt();
		System.out.println("Enter sub2:");
		sub2 = sc.nextInt();
		System.out.println("Enter sub3:");
		sub3 = sc.nextInt();
		
		total = sub1 + sub2 + sub3;
		avg = total/3.0;
		
		if(sub1 >= 35 && sub2 >= 35 && sub3 >= 35) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		if(result.equals("pass")) {
			if(avg >= 70)
				grade = "A";
			else if(avg >= 60 && avg < 70)
				grade = "B";
			else if(avg >= 50 && avg < 60)
				grade = "C";
			else if(avg >= 35 && avg < 50)
				grade = "D";
			else
				grade = "F";
		}else {
			grade = "F";
		}
		
		System.out.println("name    = " + name);
		System.out.println("rollno  = " + rollno);
		System.out.println("sub1    = " + sub1);
		System.out.println("sub2    = " + sub2);
		System.out.println("sub3    = " + sub3);
		System.out.println("total   = " + total);
		System.out.println("average = " + avg);
		System.out.println("resutl  = " + result);
		System.out.println("grade   = " + grade);
		
		sc.close();
	}

}
