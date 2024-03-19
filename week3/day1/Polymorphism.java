package week3.day1;


public class Polymorphism {
	
	public void reportStep(String message,String status) {
		System.out.println("Method with two argument");
	}

	public void reportStep(String message,String status,Boolean snap) {
		System.out.println("Method with three arguments");
		if(snap) {
			System.out.println("Snapshot taken");
		}
		else {
			System.out.println("Snapshot not taken");
			
		}
	}
	public static void main(String args[]) {
		Polymorphism poly = new Polymorphism();
		poly.reportStep("message", "status");
		poly.reportStep("message", "status", true);
	}
}
	

