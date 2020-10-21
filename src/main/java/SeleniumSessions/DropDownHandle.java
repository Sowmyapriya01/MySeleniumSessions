package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By industry = By.id("Form_submitForm_Industry");
		By Country = By.id("Form_submitForm_Country");
		doDropDownSelectByVisibleText(industry, "Agriculture / Forestry");
//		Select select =new Select(industry);
//		select.selectByIndex(5);
//		select.selectByVisibleText("Agriculture / Forestry");
//		select.selectByValue("Education");
//		
//		Select select_Country = new Select(Country);
//		select_Country.selectByIndex(4);
		
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
		
	}
	
	public static void doDropDownSelectByVisibleText(By Locator, String Value)
	{
		Select select = new Select(getElement(Locator));
		select.selectByVisibleText(Value);
	}
	public static void doDropDownSelectByvalue(By Locator, String Value)
	{
		Select select = new Select(getElement(Locator));
		select.selectByValue(Value);
	}
	public static void doDropDownSelectByIndex(By Locator, int index)
	{
		Select select = new Select(getElement(Locator));
		select.selectByIndex(index);
	}

}
