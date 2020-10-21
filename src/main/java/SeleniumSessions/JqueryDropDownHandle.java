package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	static WebDriver driver;
	static final String SELECT_ALL_OPTIONS = "All";
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
		By Chocies_Span=By.className("comboTreeItemTitle");
		
//		SelectChoiceFromDropDown(Chocies_Span, "choice 2");
//
//		SelectChoiceFromDropDown(Chocies_Span, "choice 6 2");

//		SelectChoiceFromDropDown(Chocies_Span,"choice 2","choice 6 2","choice 6 2 2");

		SelectChoiceFromDropDown(Chocies_Span, SELECT_ALL_OPTIONS);
//		SelectChoiceFromDropDown(Chocies_Span, "choice 7");

		
//		List<WebElement> choiceList = driver.findElements(By.className("comboTreeItemTitle"));
//		
//		for(int i=0;i<choiceList.size();i++)
//		{
//			String text = choiceList.get(i).getText();
//			System.out.println(text);
//			if(text.equals("choice 6 2 1")) {
//				choiceList.get(i).click();
//				break;
//				
//			}
//		}
//		
		
	}
	/**
	 * This method is used to select drop down list pass the unique values
	 * @param locator
	 * @param value
	 */
	public static void SelectChoiceFromDropDown(By locator, String... value)
	{
List<WebElement> choiceList = driver.findElements(locator);

		if(!value[0].equalsIgnoreCase(SELECT_ALL_OPTIONS))
		{
		
		for(int i=0;i<choiceList.size();i++)
		{
			String text = choiceList.get(i).getText();
			System.out.println(text);
			for(int j=0;j<value.length;j++) {
			if(text.equals(value[j])) {
				choiceList.get(i).click();
				break;
				}
			}
		}
		}
		else {
			try {
			for(int j=0;j<choiceList.size();j++) {
					choiceList.get(j).click();
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
		
	}
	

