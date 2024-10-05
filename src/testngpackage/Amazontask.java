package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontask 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public  void searchmobile()
	{
		WebElement searchfield=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchfield.sendKeys("mobile phones",Keys.ENTER);
		String actualtitle=driver.getTitle();
		String exptitle="Amazon.in : mobile phones";
		System.out.println("Title is:"+actualtitle);
		Assert.assertEquals(actualtitle, exptitle);
		System.out.println("Title verified");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]")).click();
		Set<String>allWindowHandles=driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,500)", "");
				WebElement cart=driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input"));
				cart.click();
			
		
			}
		
		}
		
	}
	

}
