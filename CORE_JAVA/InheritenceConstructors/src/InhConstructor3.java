class Students{
	private int rollNo;
	private String name;
	public Students(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

class Marks2 extends Students{
	private int sub1;
	private int sub2;
	
	public Marks2(int rollNo, String name, int sub1, int sub2) {
		super(rollNo, name);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}



	@Override
	public String toString() {
		return "Marks [sub1=" + sub1 + ", sub2=" + sub2 + ", toString()=" + super.toString() + "]";
	}
	
}


public class InhConstructor3 {

	public static void main(String[] args) {
		
		Students sob = new Marks2(1, "raj", 50, 40);
		
		System.out.println(sob);

	}

}

