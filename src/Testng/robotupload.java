package Testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class robotupload {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void fileupload() throws JavascriptException, AWTException, Exception
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileupload("C:\\Users\\User\\Documents\\TEST SCENARIO.docx");
	}
	
	public void fileupload (String p) throws JavascriptException, AWTException, InterruptedException {
	StringSelection strSelection =new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	
	
	Robot robot=new Robot();
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
