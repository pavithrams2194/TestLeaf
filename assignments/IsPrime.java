package week1.day2.assignments;

public class IsPrime {
	public static void main(String[] args) {
		int num=7;
		boolean divisible=false;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					divisible=true;
					break;
				}
			}
			if(!divisible) {
				System.out.println(num+" is prime number");
			}
			else {
				System.out.println(num+" is not a prime number");
		}
	}

}
