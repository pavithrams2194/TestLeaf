package week3.day2;

public class Amazon extends CanaraBank{

	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
		
	}

	public void upiPayments() {
		System.out.println("upiPayments");
		
	}

	public void cardPayments() {
		System.out.println("cardPayments");
		
	}

	public void internetBanking() {
		System.out.println("internetBanking");
		
	}
	public static void main(String[] args) {
		CanaraBank cnb=new Amazon();
		cnb.recordPaymentDetails();
		cnb.cashOnDelivery();
		cnb.upiPayments();
		cnb.internetBanking();
	}
}
