package Testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public  class datadriventest {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Documents\\Book1.xlsx");//to read file path
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook details
		XSSFSheet sh=wb.getSheet("sheet1");//sheet details
		int row=sh.getLastRowNum();//return last rownumber
		for(int i=1;i<=row;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"-----"+pswd);
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(un);
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(pswd);
			driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
			driver.navigate().refresh();
		}
	}

}
