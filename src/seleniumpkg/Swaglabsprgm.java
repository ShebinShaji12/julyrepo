package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabsprgm {
	
	ChromeDriver driver;
	@Before
	public void main()
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void setup()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	
		//add to cart
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']/span")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys(("shebin"));
		driver.findElement(By.id("last-name")).sendKeys("shaji");
		driver.findElement(By.id("postal-code")).sendKeys("678582");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		
	}

}
