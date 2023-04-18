package DataDrivenPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataToWebPage {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		try
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		File f = new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\DataDrivenFramework\\target\\emptyexcel.xlsx");
		FileInputStream input  = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(input);
		XSSFSheet sh = w.getSheet("Sheet1");
		
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.name("q"));
		
		for(int i=0; i<sh.getPhysicalNumberOfRows();i++)
		{
			ele.sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		}
		Thread.sleep(2000);
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
