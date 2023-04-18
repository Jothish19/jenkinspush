package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotVisible {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.snapdeal.com");
			driver.findElement(By.xpath("//*[@id='sdHeader']/div[2]/button")).sendKeys("Adidas Shoes",Keys.ENTER);
			
		} catch (Throwable e) {
			
			
		} 
		
		finally {
			System.out.println("ElementNotVisibleException");
		}
		
		
		
	}

}