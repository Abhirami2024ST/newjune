package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checkavailability 
{
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver= new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void textchecking()
{
	WebElement a=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	if(a.getAttribute("value").equals("Check availability"))
	{
		System.out.println("Text matches");
	}
	else
	{
		System.out.println("Text not matches");
	}
}
}
