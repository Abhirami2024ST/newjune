package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbloginvalidation 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	

	@Test
	public void fblogin()
	{
		driver.findElement(By.name("email")).sendKeys("abhiramiaravind@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("7907890318");
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/homepage";
		String actualurl=driver.getCurrentUrl();
		if(expurl.equals(actualurl))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Invalid login");
		}
	}
}
