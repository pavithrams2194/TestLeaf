package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		int num =11311;
		int remainder;
		int newNumber=0;
		for(int i=num;i>0;) {
			remainder=i%10;
			newNumber=(newNumber*10)+remainder;
			i=i/10;
			
		}
		if(num==newNumber) {
			System.out.println("The number is Palindrome");
		}
		else {
			System.out.println("The number is not a Palindrome");
		}
	}
}
