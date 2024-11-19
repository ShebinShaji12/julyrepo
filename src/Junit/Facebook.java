package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("shebin12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("my123456");
		driver.findElement(By.name("login")).click();
		
		
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	

}
