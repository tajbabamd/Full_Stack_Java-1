class X{
	public void add(int x, int y) {
		int z;
		z = x + y;
		System.out.println("add = " + z);
	}
}

class Y extends X{
	public void add(int x, int y) {
		System.out.println("add = " + (x + y));
	}
	
	public void old_add() { // if i don't mention super the class will consider add() method in  
							// local class not in the super class.
		super.add(10, 5);
	}
	
	public void latest_add() {
		add(9, 2);
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		
		Y yob = new Y();
		
		yob.old_add();
		yob.latest_add();
		

	}

}
