package seleniumpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websiteprgm {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("C:/Users/User/Documents/website.html");
		driver.manage().window().maximize();
	
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text is" +text);
		a.accept();
		//a.dismiss();//to cancel alert
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("shebin");
		driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("shaji");
        driver.findElement(By.xpath("//html/body/input[4]")).click();	
		
	}
	
	
	

}
