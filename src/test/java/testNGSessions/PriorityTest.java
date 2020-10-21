package testNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1 , enabled = true)
	public void aTest()
	{
		System.out.println("a Test");
	}
	@Test
	public void bTest()
	{
		System.out.println("b Test");
	}
	@Test
	public void cTest()
	{
		System.out.println("c Test");
	}
	@Test(priority = 5)
	public void dTest()
	{
		System.out.println("d Test");
	}
	@Test
	public void eTest()
	{
		System.out.println("e Test");
	}
}
