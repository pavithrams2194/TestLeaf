package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		//initialize String array
		String[] company= {"HCL","Wipro","AspireSystems","CTS"};
		
		//initialize array list
		List<String> companyList=new ArrayList<>();
		
		//Add elements in array to list
		for(String each:company) {
			companyList.add(each);
		}
		
		//sort list in ascending order
		companyList.sort(null);
		
		//Print the elements in list in reverse manner
		for(int i=companyList.size()-1;i>=0;i--) {
			System.out.println(companyList.get(i));
		}
	}
}

