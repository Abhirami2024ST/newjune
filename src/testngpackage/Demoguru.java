package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoguru 
{
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void test()
{
	Actions act= new Actions(driver);
	WebElement rightclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	act.contextClick(rightclk).perform();
	WebElement elementOpen = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	elementOpen.click();
	driver.switchTo().alert().accept();
	WebElement dubleclk= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(dubleclk).perform();
	Alert alert = driver.switchTo().alert();
	String alertMessage= driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	alert.accept();
	
}
	
}
