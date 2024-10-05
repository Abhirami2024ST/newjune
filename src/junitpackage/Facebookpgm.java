package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpgm 

{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
@Test
public void faceBook()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhiramiaravind000@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abhiramiaravind");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
