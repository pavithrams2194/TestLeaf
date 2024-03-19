package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> mobilePrices=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String> priceList=new ArrayList<String>();
		for(WebElement each:mobilePrices) {
			priceList.add(each.getText());
		}
		System.out.println(priceList);
	}

}
