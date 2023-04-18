package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		try {
			driver.findElement(By.xpath("//input[@name='mail']")).click();	
		}
		
		catch (Throwable e) {
		
	}	
		finally {
			System.out.println("NoSuchElementExpectation");
		}
		
		driver.close();
	}
}