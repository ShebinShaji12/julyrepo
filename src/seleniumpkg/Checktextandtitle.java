package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checktextandtitle {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://luminartechnolab.com");
		
		String actualtitle=driver.getTitle();
		String exptitle="Luminar Technolab";
		
		if (actualtitle.equals(exptitle))
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
