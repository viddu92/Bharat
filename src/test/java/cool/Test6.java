package cool;

import org.testng.annotations.*;

//Refer testng2.xml//

public class Test6

{
	
	@BeforeTest
	
	public void beforeTest1()
	{
		System.out.println("2-before test\n");
	}
	
	@Test
	
	public void Test2()
	{
		System.out.println("@Test annotation_2");
	}
	
	@AfterTest
	
	public void afterTest2()
	{
		System.out.println("2-after test\n");
	}

}



