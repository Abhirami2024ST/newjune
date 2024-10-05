package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage 
{
	
	WebDriver driver;
	By fbcreatepage= By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void createPageClick()
	{
		driver.findElement(fbcreatepage).click();
	}
	public void getSource() 
	{
		String actualsrc = driver.getPageSource();
		String expsource="Create a Page";
		if(actualsrc.contains(expsource))
		{
			System.out.println("Page contains text as expected");
		}
		else
		{
			System.out.println("Text not found");
		}
	}

}
