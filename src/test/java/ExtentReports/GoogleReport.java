package ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GoogleReport {

	public static void main(String[] args) throws InterruptedException {
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("C:\\Users\\NEVEDHA\\eclipse-workspace\\DataDrivenFramework\\ExtentReport\\Report2.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest test = extent.createTest("FirstTest", "Description");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NEVEDHA\\eclipse-workspace\\java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		test.log(Status.INFO, "Opening google page");
		driver.get("https://www.google.com");
		test.log(Status.INFO, "google page is open");

		driver.findElement(By.name("q")).sendKeys("Selenium report");
		test.pass("Entered text in search box");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).click();
		test.pass("clicked on search button");
		
		driver.close();
		extent.flush();
		

	}

}
