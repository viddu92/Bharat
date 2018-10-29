package cool;

import org.testng.annotations.*;

public class Test7

{
	
	@BeforeTest
	
	public void beforeTest3()
	{
		System.out.println("3-before test\n");
	}
	
	@Test
	
	public void Test3()
	{
		System.out.println("@Test annotation_3");
	}
	
	@AfterTest
	
	public void afterTest3()
	{
		System.out.println("3-after test\n");
	}

}




