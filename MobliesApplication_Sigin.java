package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobliesApplication_Sigin {
	WebDriver driver;
	@BeforeSuite
	public void Lanching_the_Browser() {
		System.setProperty("webdriver.chrome.driver", "./Sources1/chromedriver.exe");
         driver = new ChromeDriver();		
         driver.get("https://mobileworld.azurewebsites.net");
         //driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
	}

}
