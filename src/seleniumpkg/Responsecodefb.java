package seleniumpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodefb {
	ChromeDriver driver;
	@Before
	public void main()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
			
	}
	@Test
	public void testlink()
	{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+li.size());
	for(WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		verify(link);
	}
}
	private void verify(String link) {
		try {
			URI obj=new URI(link);
			HttpURLConnection con=(HttpURLConnection)obj.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("Success response code id 200------"+link);
			}
			else if (con.getResponseCode()==404)
			{
				System.out.println("Broken link response code id 404------"+link);
			}
		}
		catch (Exception e) 
		{
		System.out.println(e.getMessage());
		}
		{
			
		}
	}
}






