package seleniumpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	
  ChromeDriver driver;
  
  @Before
  public void main()
  {
	 driver=new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 driver.manage().window().maximize();
  }
  
  @Test
  public void setup()
  {
	 List<WebElement>li=driver.findElements(By.tagName("a"));
	 System.out.println("no of links="+li.size());
	 
	 if (driver.getPageSource().contains("Create a Rediffmail account"))
	 {
	System.out.println("pass");
	 }
else
	{
	System.out.println("fail");
	}
  }
}
  