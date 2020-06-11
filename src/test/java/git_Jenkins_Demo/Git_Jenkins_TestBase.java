package git_Jenkins_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Git_Jenkins_TestBase {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\granj\\selenium\\eclipse-workspace\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
