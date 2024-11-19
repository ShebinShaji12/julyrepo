package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demobank {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		WebElement account=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		Actions act=new Actions(driver);
		WebElement account1=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
		act.dragAndDrop(account,account1).perform();
		
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amount1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(amount, amount1).perform();
		
		WebElement account2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accounts2=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/div"));
		act.dragAndDrop(account2,accounts2).perform();
		
		WebElement amount2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amounts2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(amount2, amounts2).perform();
		
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if (logo.isDisplayed()){
			System.out.println("perfect is present");
		}
		else
		{
			System.out.println("not present");
		}
	}
		
		
		

}
