package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {
	public static void main(String[] args) {
		//initialize two array
				int[] a= {3,2,11,4,7,10,5};
				
				//Declare array List
				List<Integer> aList=new ArrayList<>();
				
				//add all elements in array to list
				for(int each:a) {
					aList.add(each);
				}
				
				//sort list in ascending order
				Collections.sort(aList);
				
				System.out.println("The Sorted List:"+aList);
				
				List<Integer> missingElement = new ArrayList<>();
				
				//Find missing element in list sequence
				for(int i=0;i<aList.size()-1;i++) {
					int nextElement=aList.get(i)+1;
					if(nextElement==aList.get(i+1)) {
						continue;
					}
					else {
						for(int j=nextElement;j<aList.get(i+1);j++) {
						missingElement.add(j);
						}
					}
				}
				//print missing element
				System.out.println("The missing elements:"+missingElement);
	}
}
