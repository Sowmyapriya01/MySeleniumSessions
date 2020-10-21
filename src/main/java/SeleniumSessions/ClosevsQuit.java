package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClosevsQuit {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5292996\\Desktop\\Java\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// ChromeDriver: chrome on WINDOWS (3af9a7f0d886f6cc883283574f52ea4f)
		driver.get("https://www.google.com");
		//ChromeDriver: chrome on WINDOWS (3af9a7f0d886f6cc883283574f52ea4f)
		String title = driver.getTitle();
		//ChromeDriver: chrome on WINDOWS (3af9a7f0d886f6cc883283574f52ea4f)
		System.out.println("Title is " + title);
		driver.close();
		//System.out.println(driver.getTitle()); exception
		driver=new ChromeDriver();
		System.out.println(driver.getTitle());

	}
}
