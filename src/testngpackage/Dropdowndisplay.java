package testngpackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dropdowndisplay 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void link()
	{
		 Select dropdown = new Select(driver.findElement(By.id("country")));
		    List<WebElement> dd = dropdown.getOptions();
		  //  System.out.println("Total countries count:"+dd.size());
		    for(WebElement ddlist:dd)
		    {
		    	System.out.println(ddlist.getText());
		    }

	}
}
