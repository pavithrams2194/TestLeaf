package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class ListAssignment {
	public static void main(String[] args) {
		//initialize two array
		int[] a= {3,2,11,4,6,7,5};
		int[] b= {1,2,8,4,9,7,5,4};
		//Declare array List
		List<Integer> aList=new ArrayList<>();
		List<Integer> bList=new ArrayList<>();
		List<Integer> cList=new ArrayList<>();
		//Add array elements to list
		for(int each:a) {
			aList.add(each);
		}
		for(int each:b) {
			bList.add(each);
		}
		//iterate aList
		for(int i=0;i<aList.size();i++) {
			//iterate bList
			for(int j=0;j<bList.size();j++) {
				//compare two list item
				if(aList.get(i)==bList.get(j)) {
					//add common element to cList
					if(!cList.contains(aList.get(i))){
						cList.add(aList.get(i));
						break;
					
				}
			}
		}
	}
		//print cList
		System.out.println(cList);
	}
}
