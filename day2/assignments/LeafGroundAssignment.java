package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundAssignment {
public static void main(String[] args) {
	//initialize chrome driver
	ChromeDriver driver=new ChromeDriver();
	//Load URL
	driver.get("https://leafground.com/button.xhtml");
	//click click and confirm button
	driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following::button[1]")).click();
	
	//verify title of current page
	System.out.println("Title of the page: "+driver.getTitle());
	
	//verify if confirm if the button is disabled
	driver.navigate().back();
	Boolean buttonEnabled=driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following::button[1]")).isEnabled();
	System.out.println("Button Enabled: "+buttonEnabled);
	
	//get the position of submit button
	System.out.println("Loaction of Sumit button: "+
			driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
	
	//get the colour of save button
	System.out.println("Background Colour of Save button: "+
			driver.findElement(By.xpath("//span[text()='Save']/parent::button")).getCssValue("backgroundColor"));
	
	//get the size of the Find the height and width of this button
	System.out.println("Size of submit button: "+
			driver.findElement(By.xpath("(//span[text()='Submit'])[2]/parent::button")).getSize());
	
	
	//close window
	driver.close();
	
	
	
	
	
	
	
	
	
}
}
