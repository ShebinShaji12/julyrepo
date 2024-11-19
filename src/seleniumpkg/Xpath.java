package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@Email address or phone number]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("login")).click();
	}

}
