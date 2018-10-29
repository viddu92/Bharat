package cool;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WindowsNavigate {
	
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void getURL()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\Desktop\\Selenium\\dependencies\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("in FB page\n");
		
	}
	
	
	//@Test(priority=1)
	
	public void browserTest()
	{
	
		driver.navigate().to("http://toolsqa.com/selenium-webdriver/switch-commands/");
		System.out.println("in ToolSQA page\n");
		driver.navigate().back();
		System.out.println("back to FB\n");
		driver.navigate().forward();
		System.out.println("forward to Toolsqa\n");
		driver.navigate().refresh();
		System.out.println("Refersh ToolSQA\n");
	 
	}
	
	@Test(priority=2)
	
	public void windowHandle() throws InterruptedException
	{
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getClass());
		Thread.sleep(2000);
		driver.manage().window().getPosition();
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point (10,30));
		Thread.sleep(5000);
	}
	
	//@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Closing the Browser\t");
	}
	

}
