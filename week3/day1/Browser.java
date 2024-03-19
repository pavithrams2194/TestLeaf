package week3.day1;

public class Browser {
public String browserName;
public String browserVersion;

public void openURL(){
	System.out.println("URL open succesfully");
	
}
public void closeBrowser() {
	System.out.println("Browser Closed successfully");
}
public String getBrowserName() {
	return browserName;
}
public void setBrowserName(String browserName) {
	this.browserName = browserName;
}
public String getBrowserVersion() {
	return browserVersion;
}
public void setBrowserVersion(String browserVersion) {
	this.browserVersion = browserVersion;
}
public void navigateBrowser() {
	System.out.println("Navigate browser");
	
}

}
