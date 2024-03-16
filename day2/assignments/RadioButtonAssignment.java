package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {
	public static void main(String[] args) throws InterruptedException {
		//initialize chrome driver
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("https://www.leafground.com/radio.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//implicitly wait for page to get loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select Chrome radio button
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		
		//verify radio button unselected
		WebElement chennai=driver.findElement(By.xpath("//label[text()='Chennai']/parent::div//input"));
		//click first time
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		//verify if radio button is selected
		System.out.println("Radio button selected after one click: "+chennai.isSelected());
		Thread.sleep(3000);
		//click second time
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		//verify if radio button unselected after second click
		System.out.println("Radio button selected after second click: "+chennai.isSelected());
		
		//get the default selected radio button
		WebElement selectedRadioButton = driver.findElement(By.xpath(
				"(//h5[text()='Find the default select radio button']//following::table//input[@checked='checked']/following::label)[1]"));
		System.out.println(selectedRadioButton.getText()+" radio button is selected by default.");
		
		//check if 21-40 years radio button is enabled else click it
		Boolean ageEnabled=driver.findElement(By.xpath("//label[text()='21-40 Years']//parent::div//input")).isEnabled();
		if(ageEnabled) {
			System.out.println("21-40 years radio button enabled already");
		}
		else {
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}
		
		driver.close();
	}

}
