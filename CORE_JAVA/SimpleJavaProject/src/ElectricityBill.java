
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pread, cread, tuc;
		double puc, bill;
		pread = 21294;
		cread = 21562;
		tuc = cread - pread;
		puc = 6.10;
		bill = tuc * puc;
		
		System.out.println("Total unit consumed = " +tuc);
		System.out.println("Per unit cost = " +puc);
		System.out.println("Total bill = " +bill);
		
//		int pread = 21294, cread = 21562;
//		double puc = 6.10;
//		System.out.println("Total unit consumed = " +(cread-pread));
//		System.out.println("Per unit cost = " +puc);
//		System.out.println("Total bill = " +((cread-pread)*puc));		
		

	}

}
