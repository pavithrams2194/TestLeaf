package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {
	public static void main(String[] args) throws InterruptedException {
		//Intialize chrome driver
				ChromeDriver driver = new ChromeDriver();
				//load URL "http://leaftaps.com/opentaps/control/main"
				driver.get("http://leaftaps.com/opentaps/control/main");
				//maximize the window
				driver.manage().window().maximize();
				//implicit wait for page to get loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter username
				driver.findElement(By.id("username")).sendKeys("DemosalesManager");
				//Enter password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//click CRM/SFA link
				driver.findElement(By.partialLinkText("CRM")).click();
				//click Leads link
				driver.findElement(By.linkText("Leads")).click();
				//click find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//click phone tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				//Enter Phone Number
				
				driver.findElement(By.name("phoneNumber")).sendKeys("9999");
				//Enter Find Leads Button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//Click first record
				Thread.sleep(5000);
				WebElement leadID=driver.findElement(By.xpath("//span[text()='Lead List']/following::tr[2]//a[1]"));
				String leadIDNumber=leadID.getText();
				leadID.click();
				//click delete 
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				//click Find leads
				driver.findElement(By.linkText("Find Leads")).click();
				//Enter captured lead Id number
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDNumber);
				//Enter Find Leads Button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//verify message displayed
				driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				//close browser
				driver.close();
				
				
				
				
				
				
	}

}
