package JavaEasyBook;

public class PracticePg62A {

	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 10; i++) {
			if(i == 5) {
				System.out.println("*".repeat(3) + " Continue -is being applied to the loop " + "*".repeat(3));
				continue;
			}
			if(i == 9) {
				System.out.println("*".repeat(3) + " Break ----is being applied to the loop " + "*".repeat(3));
				break;
			}
			
			System.out.println("*".repeat(3) + " " + i + " " + "*".repeat(3));
		}

	}

}
