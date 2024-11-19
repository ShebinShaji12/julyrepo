package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebooklogin {
	
	
	ChromeDriver driver;
	@BeforeTest(alwaysRun =true)
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod(alwaysRun =true)
	public void mthd()
	{
		driver.get("https://www.facebook.com");
	}
	
	
	@Parameters({"s","n"})
	@Test
	public void test(String un,String pswd)
	{
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pswd);
	}

	
	
	
	

}
