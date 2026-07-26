class Student{
	private int rollNo;
	private String name;
	
	public Student() {
		rollNo = 1;
		name = "A";
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

class Marks extends Student{
	private int sub1;
	private int sub2;
	
	public Marks() {
		super();
		sub1 = 50;
		sub2 = 50;
	}



	@Override
	public String toString() {
		return "Marks [sub1=" + sub1 + ", sub2=" + sub2 + ", toString()=" + super.toString() + "]";
	}

	
	
}
public class InhConstructor1 {

	public static void main(String[] args) {
		
		Marks mob = new Marks();
		
		System.out.println("Mob = " + mob);

	}

}
