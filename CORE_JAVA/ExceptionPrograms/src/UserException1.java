
class MinimumDepositException extends Exception{
	String errorMessage = " ";
	public MinimumDepositException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}	
	public String toString() {
		return "MinimumDepositException [ errorMessage = " + errorMessage + "]";
	}
}

class Bank{
	private String customerName;
	private int accountNumber;
	private double amount;
	public void createAccount(String customerName, int accountNumber, double amount) {
		try {
			if(amount < 1000.00) {
				throw new MinimumDepositException("Minimum amount to create an account "
						+ "is 1000.00 Rs/-");
			}
			this.customerName = customerName;
			this.accountNumber = accountNumber;
			this.amount = amount;
		}catch(MinimumDepositException e) {
			System.out.println("Error: " + e);
		}
	}
	@Override
	public String toString() {
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", amount=" + amount + "]";
	}
}

public class UserException1 {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.createAccount("raj", 10020, 240.00);
		
		System.out.println(b);

	}

}
