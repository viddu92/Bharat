package cool;

import org.testng.annotations.*;

//Refer testng2.xml//

public class Test5 {
	
	@BeforeTest
	
	public void beforeTest1()
	{
		System.out.println("1-before test\n");
	}
	
	@Test
	
	public void Test1()
	{
		System.out.println("@Test annotation-1");
	}
	
	@AfterTest
	
	public void afterTest1()
	{
		System.out.println("1-after test\n");
	}

}




