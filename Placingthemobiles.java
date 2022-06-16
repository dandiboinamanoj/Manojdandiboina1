package test1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//PostiveTestCases

public class Placingthemobiles extends SearchforAllmobiles {
	@Test(priority = 2)
	public void Order() throws InterruptedException, Exception
	{
		
	Set<String> window = driver.getWindowHandles();
	Iterator<String>it = window.iterator();
	Thread.sleep(2000);
	String parentId = it.next();
	String childId = it.next();
	driver.switchTo().window(childId);
	driver.findElement(By.id("inputFirstName")).sendKeys("manoj");
	driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("dandiboina");
	driver.findElement(By.id("inputEmail")).sendKeys("Qualitest@gmail.com");
	driver.findElement(By.id("inputPassword")).sendKeys("Manoj@123");
	driver.findElement(By.xpath("//input[@id='flexRadioDefault1']")).click();
	driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("9392452772");
	driver.findElement(By.id(" address1")).sendKeys("2nd cross road munivenkatappa layout bengauluru");
	driver.findElement(By.id("address2")).sendKeys("sir sai nilyala_pg");
	driver.findElement(By.id("inputCity")).sendKeys("Hyderbad");
	WebElement dropdown = driver.findElement(By.id("inputState"));
	Select sle23= new Select(dropdown);
	sle23.selectByVisibleText("Goa");
	driver.findElement(By.id("inputZip")).sendKeys("560045");
	driver.findElement(By.xpath("//*[.='Apple']")).click();
	driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("3");
	WebElement dropdown1 = driver.findElement(By.id("bought"));
	Select manoj= new Select(dropdown1);
	manoj.selectByValue("0");
	driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(3000);
	Robot ro=new Robot();
	for(int i=0;i<2;i++)
	{
	ro.keyPress(KeyEvent.VK_TAB);
	}
	ro.keyRelease(KeyEvent.VK_TAB);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	}
	
	//NegativeTestCases
	
	
//	@Test()
//	public void NegativeOrderMobiles() throws InterruptedException, AWTException{
//	Set<String> window = driver.getWindowHandles();
//	Iterator<String>it = window.iterator();
//	Thread.sleep(2000);
//		String parentId = it.next();
//		String childId = it.next();
//		driver.switchTo().window(childId);
//		driver.findElement(By.id("inputFirstName")).sendKeys("ma");
//		driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("dan");
//		driver.findElement(By.id("inputEmail")).sendKeys("A@gmail.com");
//		driver.findElement(By.id("inputPassword")).sendKeys("@212123");
//		driver.findElement(By.id("flexRadioDefault2")).click();
//		driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("0000000000");
//		driver.findElement(By.id(" address1")).sendKeys("2nd cross ");
//		driver.findElement(By.id("address2")).sendKeys("sir sai nilyal");
//		driver.findElement(By.id("inputCity")).sendKeys("Japan");
//		WebElement dropdown = driver.findElement(By.id("inputState"));
//		Select sle23= new Select(dropdown);
//		sle23.selectByVisibleText("Banka");
//	   driver.findElement(By.id("inputZip")).sendKeys("122aesrt");
//		driver.findElement(By.xpath("//*[.='Apple']")).click();
//		driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("3");
//		WebElement dropdown1 = driver.findElement(By.id("bought"));
//		Select manu1= new Select(dropdown1);
//		manu1.selectByVisibleText("Apple XS ");
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		Robot ro=new Robot();
//		for(int i=0;i<2;i++)
//		{
//		ro.keyPress(KeyEvent.VK_TAB);
//		}
//		ro.keyRelease(KeyEvent.VK_TAB);
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);			
//}
}
