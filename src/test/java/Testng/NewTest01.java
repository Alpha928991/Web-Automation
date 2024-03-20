package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.FormatString;

public class NewTest01 {
	WebDriver driver;
	@BeforeMethod
	public void launchurl() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://parabank.parasoft.com/parabank");
	}
  @Test
  public void login() throws InterruptedException {
	 
	  driver.findElement(By.name("username")).sendKeys("Shubham23");
	  driver.findElement(By.name("password")).sendKeys("parul@123");
	  driver.findElement(By.className("button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @AfterMethod
  public void close() {
	  driver.close();
  }
  }
