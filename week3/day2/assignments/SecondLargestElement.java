package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
	public static void main(String[] args) {
		//initialize two array
		int[] a= {3,2,11,4,6,7,10,5};
		
		//Declare array List
		List<Integer> aList=new ArrayList<>();
		
		//add all elements in array to list
		for(int each:a) {
			aList.add(each);
		}
		
		//sort list in ascending order
		Collections.sort(aList);
		
		//print second last element of sorted array
		System.out.println("The second largest element is:"+aList.get(aList.size()-2));
			
	}

}
