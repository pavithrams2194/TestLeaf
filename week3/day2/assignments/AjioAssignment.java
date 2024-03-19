package week3.day2.assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioAssignment {

	public static void main(String[] args) throws InterruptedException {
		//initialize chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL "https://www.ajio.com/" 
		driver.get("https://www.ajio.com/");
		
		//Maximize the current window
		driver.manage().window().maximize();
		
		//initialize implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter bags in search textbox
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");
		
		//click search button
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		
		//click men checkbox
		driver.findElement(By.xpath("//input[@id='Men']//parent::div")).click();
		
		Thread.sleep(3000);
		//click fashion bags checkbox
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']//parent::div")).click();
		
		Thread.sleep(2000);
		//print count of items found
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		//print the list of brand displayed
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']//strong"));
		
		Set<String> brand_names =new HashSet<>();
		
		for(WebElement each:brandList) {
			brand_names.add(each.getText());
		}
		System.out.println("Brand List displayed: "+ brand_names);
		
		//print the names of bag displayed
		
		List<WebElement> bagNames=driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(WebElement each:bagNames) {
			System.out.println(each.getText());
		}
		
		
		
	}
}
