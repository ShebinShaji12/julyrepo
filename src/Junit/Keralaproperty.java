package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
	
	ChromeDriver driver;
	@Before
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void propertylogin()
	{
		driver.findElement(By.id("ulogin")).sendKeys("kerala@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("123456");
		driver.findElement(By.id("sub_logbtn")).click();
		
	}
	@After
	public void teardown()
	{
		driver.quit();
	}

}