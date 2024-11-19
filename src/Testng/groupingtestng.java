package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingtestng {
	
	ChromeDriver driver;
	@BeforeTest
	public void setu()
	{
		 driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void mthd()
	{
		driver.get("https://www.facebook.com");
	}
	
	@Test(groups = "regression")
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("shebin98@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
	}
	@Test(groups = {"smoke","sanity"})
	public void contains()
	{
		String src=driver.getPageSource();
		if(src.contains("about"))
		{
			System.out.println("it contains");
		}
		else
		{
			System.out.println("it does not contains");
		}
	}
	@Test(groups = "sanity")
	public void title()
	{
		String actualtitle=driver.getTitle();
		String exptitle="yahoo";
		
		if(actualtitle.equals(exptitle))
		{
			System.out.println("both are same title");
		}
		else
		{
			System.out.println("both are not same title");
		}
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
