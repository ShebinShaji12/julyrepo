package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleprgm {
	
	 ChromeDriver driver;
	 @Before
	 public void main()
	 {
		 
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();

}
	 @Test
	 public void checking()
	 {
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		
	 }
	 
		 
	 }
