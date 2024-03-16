package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {
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
	//Enter fistname(local)
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("pavi");
	//Enter department name
	driver.findElement(By.name("departmentName")).sendKeys("Information technology");
	//Enter description
	driver.findElement(By.name("description")).sendKeys("asdfsdf");
	//Enter E-mail
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gm@gmail.com");
	//Select state
	WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
	Select selState = new Select(state);
	selState.selectByVisibleText("New York");
	//click create button
	driver.findElement(By.name("submitButton")).click();
	//click edit button
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	//clear description field
	driver.findElement(By.name("description")).clear();
	//enter important note
	driver.findElement(By.name("importantNote")).sendKeys("dfgh");
	//click update button
	driver.findElement(By.name("submitButton")).click();
	//print the title of the current page
	System.out.println(driver.getTitle());
	//close browser
	driver.close();
	
	
}
}
