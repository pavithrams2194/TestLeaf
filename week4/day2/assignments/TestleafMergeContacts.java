package week4.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafMergeContacts {
	public static void main(String[] args) throws InterruptedException {
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
		
		//click contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//click merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//click on from widget
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']//following::img)[1]")).click();
		
		//switch to new window opened
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList=new ArrayList<>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(3000);
	
		//click on first resulting contact
		driver.findElement(By.xpath("(//span[text()='Contact List']//following::table//tr)[2]//td[1]")).click();
		driver.switchTo().window(windowList.get(0));
		Thread.sleep(3000);

		//click on to widget
		driver.findElement(By.xpath("(//input[@id='partyIdTo']//following::img)[1]")).click();
		
		//switch to new window opened
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowList1=new ArrayList<>(windowHandles1);
		Thread.sleep(3000);
		driver.switchTo().window(windowList1.get(1));
		
		//click on second resulting contact
		driver.findElement(By.xpath("(//span[text()='Contact List']//following::table//tr)[4]//td[1]")).click();
		driver.switchTo().window(windowList1.get(0));
		Thread.sleep(3000);

		//click merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//accept alert 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//verify page title
		System.out.println(driver.getTitle());
		
		//close the window
		driver.close();
		
		
		
		
	}

}
