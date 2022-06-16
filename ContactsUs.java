package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsUs extends Placingthemobiles {
	
	
	@Test(priority  = 3)
	public void contactUs() throws Throwable
	{
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	Set<String> window = driver.getWindowHandles();
	List<String> list= new ArrayList<String>(window);
	driver.switchTo().window(list.get(1));
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	WebElement ELement = driver.findElement(By.className("title"));
	Assert.assertTrue(ELement.isDisplayed());
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,550)");
	driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Manoj");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Qualitest@gmail.com");
	driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9392452772");
	driver.findElement(By.xpath("//*[@name='message']")).sendKeys("I booked the mobile but i wass taking the Long time for comming");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.switchTo().window(list.get(0));
	System.out.println(driver.getTitle());
	String Element12 = driver.getTitle();
	if(Element12.equals("Mobile"))
	{
	System.out.println("TestCase is passed");
	}else {
	System.out.println("TestCase is failed");
	}
	}

}
