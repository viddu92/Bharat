package cool;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	
	public void justPrintTest()
	{
		System.out.println("@Test annotation\n");
	}
	
	@BeforeMethod
	
	public void beforeTest()
	{

	System.out.println("Before @Test\n");
	
	}
	
	
	@AfterMethod
	
	public void afterTest()
	
	{
		System.out.println("After @Test\n");
	}

}