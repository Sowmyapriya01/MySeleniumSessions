package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		//get total number of images
		List<WebElement> Imagelist = driver.findElements(By.tagName("img"));
	System.out.println(Imagelist.size());
	for(int i=0;i<Imagelist.size();i++)
	{
		System.out.println(Imagelist.get(i).getAttribute("src"));
		System.out.println(Imagelist.get(i).getAttribute("alt"));

	}
	}

}
