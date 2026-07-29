import java.util.Scanner;

class InvalidPassworkException extends Exception {
	private String errorMessage;

	public InvalidPassworkException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "InvalidPassworkException [errorMessage=" + errorMessage + "]";
	}
}

class CheckPassword {
	private String password;

	public static void validatePassword(String password) throws InvalidPassworkException {
		Scanner sc = new Scanner(System.in);

			System.out.println("Enter the password:");
			
			password = sc.nextLine();
			int input = password.length();
			
			if (input < 6) {
				throw new InvalidPassworkException("Password must be atlest \n6 charecters long.");
			} else{
				System.out.println("Password accepted");
			}

	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			
			CheckPassword.validatePassword("Password");
		}catch(InvalidPassworkException e) {
			System.out.println("Error: " + e);
		}
		
		

	}

}
