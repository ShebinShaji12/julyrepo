package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
	}

}
