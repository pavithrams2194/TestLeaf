package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {
	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemosalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("pavithra");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("m");
		WebElement sourceDD=driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(0);
		sel.selectByValue("LEAD_DIRECTMAIL");
		WebElement marketingDD=driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select sel1=new Select(marketingDD);
		sel1.selectByVisibleText("Automobile");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
