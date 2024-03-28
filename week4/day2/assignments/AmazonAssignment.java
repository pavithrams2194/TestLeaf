package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter "oneplus 9 pro" in search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		
		//select the first listed product
		WebElement element = driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		
		//print the first listed product price
		String price = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']/following::span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of the first product: "+price);
		
		//print the rating of first product
		String rating = driver.findElement(By.xpath("(//div[@class='puisg-col-inner']/following::span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("rating of the first product: "+rating);
		
		//click the first image
		WebElement image = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		action.moveToElement(image).click().perform();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList=new ArrayList<>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(3000);
		//click Add to cart button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//verify cart count
		driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
		String cartCount = driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();

		System.out.println("The cart count: "+cartCount);
		if(cartCount.equals("1")){
			System.out.println("The item added to cart successfully");
			System.out.println("The cart count: "+cartCount);
		}
		
			
	}

}
