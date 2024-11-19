package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {

	 ChromeDriver driver;
	 @Before
	 public void main()
	 {
		 driver=new ChromeDriver();
		 driver.get("//https:www.amazon.com");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void purchase()
	 {
		 driver.findElement(By.xpath("//input[@placeholder=Search Amazon]")).sendKeys("search mobile");
		 
		 driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		 driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
	 }
}
