package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Loginpgm 
{
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Parameters({"id","pwd"})
@Test
public void login(String id, String pwd)
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(id);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
