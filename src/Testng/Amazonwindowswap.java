package Testng;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindowswap {
	
	ChromeDriver driver;
	@BeforeTest
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		
 ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
		 
		 driver.switchTo().window(windowdetails.get(1));
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
		
		
	}

}
