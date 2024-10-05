package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop 
{

ChromeDriver driver;
String url="https://demo.guru99.com/test/drag_drop.html";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void dragdrop()
{
	WebElement amt=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement bank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement sales= driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement bankdest=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement salesdest=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement bankamt=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement salesamt= driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	Actions act= new Actions(driver);
	act.dragAndDrop(bank, bankdest);
	act.dragAndDrop(sales,salesdest );
	act.dragAndDrop(amt, bankamt);
	act.dragAndDrop(amt, salesamt);
	act.perform();
	WebElement perfect= driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	if(perfect.isDisplayed())
	{
		System.out.println("Perfect is present");
	}
	else
	{
		System.out.println("Perfect not present");
	}
}
}
