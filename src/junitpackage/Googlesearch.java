package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
@Test
public void googleSearch()
{
	WebElement searchfield=driver.findElement(By.id("APjFqb"));
	searchfield.sendKeys("news malayalam",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
}
}
