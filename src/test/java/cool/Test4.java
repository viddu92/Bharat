package cool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test4 {
	
	
@BeforeClass (description= "before class execution")

public void beforeClass()

{
System.out.println("Before Class\n");	
}

@AfterClass(description ="after class execution")

public void afterClass()

{
	System.out.println("AFter Class");
}

	
@BeforeTest
	
	public void beforeTest()
	
	{
		
		System.out.println("Before Test\n");
	}
	
	
	@AfterTest
	
	public void afterTest()
	
	{
		
		System.out.println("After Test\n");
	}
	
@BeforeMethod
	
	public void beforeMethod()
	{

	System.out.println("Before Method\n");
	
	}
	
	
	@AfterMethod
	
	public void afterMethod()
	
	{
		System.out.println("After Method\n");
	}

	
	
@Test
	
	public void justPrintTest()
	{
		System.out.println("@Test annotation 1\n");
	}

@Test

public void justPrintTest1()
{
	System.out.println("@Test annotation 2\n");
}



}
