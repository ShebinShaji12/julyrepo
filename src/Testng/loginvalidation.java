package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginvalidation {
	
	ChromeDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keralaproperty.in/member/myhome/");
	}
	@Test
	public void validation()
	{
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("shebin21@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("12011998");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		
		String a=("https://keralaproperty.in/member/myhome/");
		if(a.equals(driver.getCurrentUrl()))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
			
			
			
		}
	
	}
}


