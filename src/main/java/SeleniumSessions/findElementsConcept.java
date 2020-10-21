package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementsConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		//to get links count
		List<WebElement> Linkslist= driver.findElements(By.tagName("a"));
		System.out.println(Linkslist.size());
		//to print text of each link
		//ignore blank spaces
//		for(int i=0;i<Linkslist.size();i++)
//		{
//			String text = Linkslist.get(i).getText();
//			if(!text.isEmpty()) {
//				System.out.println(i+"-->"+text);
//				System.out.println(Linkslist.get(i).getAttribute("href"));
//
//
//			}
//		}
//		for(WebElement e:Linkslist)
//		{
//			String text = e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//				System.out.println(e.getAttribute("href"));
//
//		}
//	}
		Linkslist.stream().forEach(ele -> System.out.println(ele.getText()));
	}
}

