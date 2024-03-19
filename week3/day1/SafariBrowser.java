package week3.day1;

public class SafariBrowser extends Browser {
	public void readerMode() {
		System.out.println("Safari opened in readerMode");
	}
	public void fullScreenMode() {
		System.out.println("Safari opened in fullscreen mode");
	}
	public static void main(String[] args) {
		SafariBrowser safari=new SafariBrowser();
		safari.setBrowserName("safari");
		System.out.println(safari.browserName);
		safari.fullScreenMode();
		safari.readerMode();
		safari.navigateBrowser();
		safari.closeBrowser();
	}
}
