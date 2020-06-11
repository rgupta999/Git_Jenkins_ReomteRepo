package git_Jenkins_Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Git_JenkinsTest extends Git_Jenkins_TestBase{
	
	@Test
	public void signUp()
	{
		driver.findElement(By.name("firstname")).sendKeys("ranjan");
		driver.findElement(By.name("lastname")).sendKeys("gupta");
		driver.findElement(By.name("websubmit")).click();
	}
	
	
	

}
