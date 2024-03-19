package week3.day1;

import java.util.Arrays;

public class Arrayexample {
public static void main(String[] args) {
	int a[]= {2,5,7,7,5,9,2,3};
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++) {
		if(a[i]==(a[i+1])) {
			System.out.println(a[i]);
		}
			
	}
	
	String str="verygood";
	char strarr[]=str.toCharArray();
	for(int i=strarr.length-1;i>=0;i--) {
		System.out.println(strarr[i]);
	}
	
	
}
}
