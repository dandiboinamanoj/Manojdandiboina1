package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Sigin_up_mobiles extends MobliesApplication_Sigin {
	
	//PostiveTestCases
	@Test()
	public void Sign_up() throws InterruptedException, Exception
	{
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[.='Sign up']")).click();	
	driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Manoj");
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dandiboina");
	driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("manojdandiboina1999@gmail.com");
    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Manoj@123");
    driver.findElement(By.xpath("//input[@type='radio']")).click();
	driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("i was the Employee of the qualiTest");
	driver.findElement(By.xpath("//input[@type='date']")).click();
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9392452772");
	driver.findElement(By.xpath("//button[@type='Submit']")).click();
	Alert Al = driver.switchTo().alert();
	Al.accept();
	Thread.sleep(3000);
	}

	@Test(dependsOnMethods = "Sign_up")
	public void Signin() throws InterruptedException {
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement user_name = driver.findElement(By.id("username"));
        user_name.click();
        user_name.sendKeys("dandiboinamanoj");
         WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
         Password.click();
          Password.sendKeys("Manoj@123");
          driver.findElement(By.xpath("//a[text()='Log In']")).click();
          Thread.sleep(3000);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//NegativeTestCases
//	@Test()
//	public void Sigup_NegativeTestcase() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//	    driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
//	    driver.findElement(By.xpath("a[text()='Sign up']")).click();	
//		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("ma");
//	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("qqqqqqqqqqqqqqqqqqqq");
//		driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("1999@gmail.com");
//	    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("j@123");
//	    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("0000000");
//	    driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
//		driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("123456udfghjdfghj dfgh qualiTest");
//		driver.findElement(By.xpath("//input[@type='date']")).click();
//		driver.findElement(By.xpath("//button[@type='Submit']")).click();
//		Alert Al = driver.switchTo().alert();
//		Al.accept();
//		Thread.sleep(3000);	
//		
//	}
	
	
	
	
	
	
	
	
	

}
