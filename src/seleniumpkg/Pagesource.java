package seleniumpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	static String baseurl="http://www.google.com";
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		
		if (src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		

	}

}
