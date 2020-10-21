package testNGSessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Setup method");
	}
	@Test(invocationCount = 10)
	public void createUser()
	{
		System.out.println("Create user");
	}

}
