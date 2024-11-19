package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileupload {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
		
		@Test
		public void webs()
		{
			driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\User\\Documents");
		
			
			WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
			checkbox.click();
			WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
			submit.click();
			String text=driver.findElement(By.xpath("//*[@id=\\\"submitbutton\\\"]")).getText();
			if(text.equalsIgnoreCase("submit"))
			{
				System.out.println("passed");
			}
			else
			{
				System.out.println("fail");
			}
			
		}
}


		
				
	
