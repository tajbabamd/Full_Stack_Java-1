class Employee2{
	private String eName;
	private int empNo;
	
	public Employee2(String eName, int empNo) {
		this.eName = eName;
		this.empNo = empNo;
	}

	//Copy constructor same as one parameterized constructor but with a className with object passing
	public Employee2(Employee2 ob) { 
		this.eName = ob.eName;
		this.empNo = ob.empNo;
	}

	@Override
	public String toString() {
		return "Employee1 [eName=" + eName + ", empNo=" + empNo + "]";
	}
	
	
}

public class Constructor3 {

	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2("Joker", 103);
		Employee2 e2 = new Employee2(e1);
		
		System.out.println("e1: " + e1);
		System.out.println("e2: " + e2);
		
	}

}

