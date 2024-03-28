package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Min and Max']//following::a)[2]")).click();
	driver.findElement(By.xpath("(//span[text()='Min and Max']//following::a)[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[text()='Min and Max']//following::a)[3]")).click();
	driver.findElement(By.xpath("(//span[text()='Min and Max']//following::a)[1]")).click();
	

	
}
}
