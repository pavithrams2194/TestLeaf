package week4.day2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Utilities {
	public boolean verifySort(List<WebElement> elements) {
		int min=0;
		boolean sort=true;
		for(WebElement each:elements) {
			int firstItemPrice=Integer.valueOf((each.getText().split("Rs."))[1].trim());
			if(firstItemPrice>=min) {
				System.out.println(firstItemPrice);
				min=firstItemPrice;
				continue;
			}
			else {
				sort=false;
				break;			
			}
		}
		return sort;
	}

}
