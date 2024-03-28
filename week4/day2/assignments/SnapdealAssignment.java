package week4.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Go to Men's Fashion
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensFashion).perform();
		
		//Go to sports shoes
		WebElement sportsShoes = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		action.moveToElement(sportsShoes).click().perform();
	
		//print Number of sports shoes
		String items = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
		System.out.println("Number of Sports Shoes: "+items);
		
		//click on training Shoes
		WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		action.moveToElement(trainingShoes).click().perform();
		
		//sort by price low to high
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']//li)[2]")).click();
		Thread.sleep(5000);
		
		//verify if the items are sorted
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		Utilities utility=new Utilities();
		boolean sort=utility.verifySort(elements);
		String text=sort?"The items are sorted by price low to high":"The items are not sorted";
		System.out.println(text);
		
		//select the price range from 500-700
		WebElement range1 = driver.findElement(By.xpath("(//div[@class='filter-inner']//a)[2]"));
		action.dragAndDropBy(range1, -140, 0).perform();
		
		Thread.sleep(3000);
		//filter by colour
		driver.findElement(By.xpath("//a[text()=' White & Blue']//parent::label//parent::div")).click();
		WebElement colour = driver.findElement(By.xpath("//a[text()=' White & Blue']//parent::label//parent::div//input"));
		if((colour.getAttribute("checked")).equals("true")) {
			System.out.println("The colour checkbox is clicked");
		}
		else {
			System.out.println("The colour checkbox is not clicked");
		}
		
		//mouse hover to first resulting image
		WebElement image = driver.findElement(By.xpath("(//picture[@class='picture-elem']//img)[1]"));
		action.moveToElement(image).perform();
		
		Thread.sleep(3000);
		//click on quick view button
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		//print the price and discount
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'Price')]//following::span[@class='payBlkBig']"));
		WebElement discount = driver.findElement(By.xpath("//div[contains(text(),'Price')]//following::span[@class='percent-desc ']"));
		System.out.println("The price is: "+price.getText());
		System.out.println("The discount is: "+discount.getText());
		
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		
		driver.close();
	
	}

}
