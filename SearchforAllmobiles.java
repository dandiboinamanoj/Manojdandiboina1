package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SearchforAllmobiles extends Sigin_up_mobiles {
	
	  //PostiveTestCases
	
	@Test(priority = 1)
	public void Applesearch() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("myInput")).sendKeys("Apple");
	 Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[.=' Order'])[4]")).click();
	}
	
	
	
//           NegativeTestCases
//	@Test
//	public void SearchMobiles_Negative() {
//		driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
//		driver.findElement(By.id("myInput")).sendKeys("Alp");
//		driver.findElement(By.xpath("(//a[.='Order'])[3]")).click();	
//	}


	}
	
