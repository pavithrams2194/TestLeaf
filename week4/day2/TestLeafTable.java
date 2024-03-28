package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafTable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("The number of countries:"+rows.size());
		Set<String> countryNames=new HashSet<>();
		List<String> duplicates=new ArrayList<>();
		

		for(int i=1;i<rows.size();i++) {
			String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']//table//tr["+i+"]//td[2]")).getText();
			if(!countryNames.add(text)) {
				duplicates.add(text);
			}
			
		}
		System.out.println("The country List is:"+countryNames);
		System.out.println("The duplicates country names are:"+duplicates);
		
	}

}
