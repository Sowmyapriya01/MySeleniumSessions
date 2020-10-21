package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	@Test(expectedExceptions = {ArithmeticException.class ,NullPointerException.class})
	public void dividionTest()
	{
		System.out.println("My div test");
		int i=9/3;
		System.out.println(i);
		String str = "priya"; 
		str = null;
		System.out.println(str.length());
	}
}
