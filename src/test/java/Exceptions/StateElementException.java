package Exceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateElementException {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://automationpractice.com/index.php?controller=authentication&amp;back=my-account");
			
			WebElement emailAddress = driver.findElement(By.id("email_create"));
			emailAddress.sendKeys("Amod@gmail.com");
			emailAddress.clear();
			emailAddress.sendKeys("Amod1@gmail.com");
			emailAddress.clear();
			emailAddress.sendKeys("Amod2@gmail.com");
			emailAddress.clear();
			driver.navigate().refresh();
			emailAddress.sendKeys("Amod4@gmail.com");
			emailAddress.clear();
			
		} catch (Throwable e) {
			
		} 
		finally {
			System.out.println("StaleElementReferenceException");
		}
		
		        
}
}