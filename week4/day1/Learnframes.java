package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframes {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String result=driver.findElement(By.xpath("//button[text()='Try it']//following::p")).getText();
		System.out.println(result);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		String result1=driver.findElement(By.xpath("//button[text()='Try it']//following::p")).getText();
		System.out.println(result1);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}

}
