package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlecheck {

	public static void main(String[] args) {
		
		//chromedriver
		//edgedriver
		//firefoxdriver
		
		ChromeDriver driver=new ChromeDriver(); //to open chrome browser
		driver.get("https://www.google.com"); //to launch webapplication
		
		String actualtitle=driver.getTitle();
		String expecttitle="google";
		
		if (actualtitle.equals(expecttitle))
		{
		 System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		driver.quit();
	}

}
