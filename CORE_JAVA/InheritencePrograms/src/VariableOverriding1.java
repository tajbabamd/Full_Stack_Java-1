class A{
	protected int a = 10;
}

class B extends A{
	protected int b = 20;
	public void show() {
		System.out.println("B.x = " + b); // B.x is 20 because it take local class as first priority
		System.out.println("A.x = " + super.a);
	}
}
public class VariableOverriding1 {

	public static void main(String[] args) {
		
		B bob = new B();
		
		bob.show();

	}

}
