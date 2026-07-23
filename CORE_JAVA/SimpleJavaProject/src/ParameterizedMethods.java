
public class ParameterizedMethods {
	
	static void add(int x, int y) {// here the variable x and y will receive the values from method call
		int c = x+y;
		System.out.println("added= "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(8,9);
		int a=30, b=6;
		add(a,b);

	}

}
