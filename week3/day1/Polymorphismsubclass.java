package week3.day1;

public class Polymorphismsubclass extends Polymorphism{
	@Override
	public void reportStep(String message,String status) {
		System.out.println("Method in subclass called");
	}
	public static void main(String[] args) {
		Polymorphismsubclass poly1=new Polymorphismsubclass();
		poly1.reportStep("message", "status");
		
		Polymorphism poly2=new Polymorphism();
		poly2.reportStep("message", "status");
	}
}
