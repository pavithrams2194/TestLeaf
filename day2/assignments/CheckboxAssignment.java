package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {
	public static void main(String[] args) {
		//initialize chrome driver
		ChromeDriver driver =new ChromeDriver();
		//Load URL "https://leafground.com/checkbox.xhtml"
		driver.get("https://leafground.com/checkbox.xhtml");
		//maximize window
		driver.manage().window().maximize();
		//implicitly wait for page to get loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click Basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//click Notification checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//verify the message displayed
		Boolean notification=driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println("Notification checkbox message displayed: "+notification);
		//select the favorite language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//select tristate checkbox
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::span[1]/parent::div")).click();
		//verify the tristate option choosen
		String triState =driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
		System.out.println("Tri"+triState);
		//click toggle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		//verify the message displayed
		Boolean toggleSwitch=driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println("ToggleSwitch checkbox message displayed: "+toggleSwitch);
		//verify disabled checkbox
		Boolean disabled=driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::input[1]")).isEnabled();
		System.out.println("checkbox disabled:"+!disabled);
		//select multiple options
		driver.findElement(By.xpath("//h5[text()='Select Multiple']//following::ul[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.close();
		
	}

}
