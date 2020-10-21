package MyTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	@Test(priority = 1)
	@Parameters ({"url"})
	public void amazonTitleTest(String url)
	{
//		driver.get("https://www.amazon.com");
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
	}
	@Test(priority =2)
	public void amazonURLTest()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	
}
