package Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TimeOutException {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		try {

			driver.get("https://www.thehost.com/profile.php");

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='a_working_locator']"))); 

			driver.findElement(By.cssSelector("input[value='a_working_locator']")).click();
			
		} 
		catch (Throwable e) {
			
		}
		
		finally {
			System.out.println("TimeoutException");
		}
		
		driver.close();
	}
}