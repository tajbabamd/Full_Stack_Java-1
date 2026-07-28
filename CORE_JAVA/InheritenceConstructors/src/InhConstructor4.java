class Person{
	private String empName;
	private String gender;
	
	public Person(String empName, String gender) {
		this.empName = empName;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [empName=" + empName + ", gender=" + gender + "]";
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class Employee extends Person{
	private int empNo;
	private String desig;
	
	public Employee(String empName, String gender, int empNo, String desig) {
		super(empName, gender);
		this.empNo = empNo;
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", desig=" + desig + ", \ntoString()=" + super.toString() + "]";
	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class PayRoll extends Employee{
	private double salary;
	
	public PayRoll(String empName, String gender, int empNo, String desig, double salary) {
		super(empName, gender, empNo, desig);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PayRoll [salary=" + salary + ", \ntoString()=" + super.toString() + "]";
	}
	
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

public class InhConstructor4 {

	public static void main(String[] args) {
		
		Person p = new PayRoll("Rajesh", "Male", 2299445, "Manager", 50000.00);
		
		System.out.println(p);
		

	}

}
