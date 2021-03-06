package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickMe_Button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")); 
		
		Actions action =new Actions(driver);
		action.contextClick(rightClickMe_Button).perform();
		
		Thread.sleep(2000);
		List<WebElement> rightClickOptionsList= driver.findElements(By.xpath("//li[contains(@class, 'context-menu-icon')]/span"));
		System.out.println(rightClickOptionsList.size());
		
		for(WebElement ele: rightClickOptionsList)
		{
			String text= ele.getText();
			if(text.equals("Copy"))
			{
				ele.click();
				break;
			}
			System.out.println(text);
		}
	}

}
