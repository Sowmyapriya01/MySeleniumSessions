package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownSingleSelection {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnotherInputBox")).click();
		
		
		By DropDownBy= By.className("comboTreeItemTitle");
		
		singleselectiondropdownselect(DropDownBy, "choice 2 1");
//		List<WebElement> singleselectiondropdownele=driver.findElements(By.className("comboTreeItemTitle"));
//		
//		for(int i=0;i<singleselectiondropdownele.size();i++)
//		{
//			String text=singleselectiondropdownele.get(i).getText();
//			System.out.println(text);
//			if(text.equals("choice 2 1")) {
//				singleselectiondropdownele.get(i).click();
//				break;
//			}
//		}
		
		
	}

	public static void singleselectiondropdownselect(By locator,String value)
	{
		List<WebElement> singleselectiondropdownele=driver.findElements(locator);
		
		for(int i=0;i<singleselectiondropdownele.size();i++)
		{
			String text=singleselectiondropdownele.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				singleselectiondropdownele.get(i).click();
				break;
			}
		}
	}

}
