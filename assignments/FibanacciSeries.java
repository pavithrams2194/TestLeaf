package week1.day2.assignments;

public class FibanacciSeries {
	
	public static void main(String[] args) {
		int previousNumber=0;
		int currentNumber=1;
		int sum;
		System.out.println(previousNumber);
		System.out.println(currentNumber);
		for (int i = 0; i < 15; i++) {
			
			sum=previousNumber+currentNumber;
			System.out.println(sum);
			previousNumber=currentNumber;
			currentNumber=sum;
		}
	}

}
