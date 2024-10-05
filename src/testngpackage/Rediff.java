package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff 
{
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
}
@Test
public void logo()
{
	WebElement l= driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/span"));
	if(l.isDisplayed())
	{
		System.out.println("Logo is present");
	}
	else
	{
		System.out.println("Logo not present");
	}
}
@Test()
public void radiobutton()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement obj=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	if(obj.isSelected())
	{
		System.out.println("Radio button is selected");
	}
	else
	{
		System.out.println("Radio button is not selected");
	}}
	@Test
	public void buttonenable()
	{
		WebElement bt=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		if(bt.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button disabled");
		}
		
	}
}

