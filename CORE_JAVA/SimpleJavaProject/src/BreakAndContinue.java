
public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			if(i == 5)
				break;
		}
		
		System.out.println();
		
		for(i = 1; i <= 10; i++) {
			if(i == 5) {
				System.out.print("_ ");
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
