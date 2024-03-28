package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[@class='selected']/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("(//div[@class='selected'])[2]/div[1]")).click();

		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']//table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("The number of trains:"+rows.size());
		Set<String> trainNames=new HashSet<>();
		List<String> duplicates=new ArrayList<>();
		List<String> expTrains=new ArrayList<>();
		for(int i=1;i<rows.size();i++) {
			String text = driver.findElement(By.xpath("//div[@id='divTrainsList']//table//tr["+i+"]//td[2]")).getText();
			if(!trainNames.add(text)) {
				duplicates.add(text);
			}
			if(text.contains("EXP")) {
				expTrains.add(text);
			}
		}
		System.out.println("The train List is:"+trainNames);
		System.out.println("The duplicates train names are:"+duplicates);
		System.out.println("The Express trains are:"+expTrains);

	
	}

}
