package mainpack;

import college.student.Student;
import emppack.Employee;
import payroll.Payroll;

public class MainProgram {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpName("Rakesh");
		e.setEmpNo(1);
		System.out.println("Employee - empName: " + e.getEmpName() 
		+ " empNo: " + e.getEmpNo() );
		
		System.out.println("-".repeat(30));
		////////////////////////////////////
		
		Payroll p = new Payroll();
		
		p.setEmpName("Rakesh");
		p.setEmpNo(1);
		p.setSalary(90000.00);
		System.out.println("Employee - empName: " + p.getEmpName() 
		+ " empNo: " + p.getEmpNo() + " Payroll - Salary: " + p.getSalary());
		
		System.out.println("-".repeat(30));
		////////////////////////////////////
		
		Student s = new Student();
		
		s.setStudentName("Raj");
		s.setStudentBranch("CSE");
		System.out.println("Student - studentName: " 
		+ s.getStudentName() + " studentBranc"+ s.getStudentBranch());
		

	}

}
