package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal 
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store/");
	
}
	@Test
	public void titlecheck()
	{
		{
			String actualtitle=driver.getTitle();
			String exptitle="Rishi Herbal";
			if(actualtitle.equals(exptitle))
			{
				System.out.println("Title as expected");
			}
			else
			{
				System.out.println("Title not matches");
			}
		}
	}
	@Test
	public void totallink()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total links count:"+li.size());
		int expcount=100;
		int actcount=li.size();
		if(actcount==expcount)
		{
			System.out.println("Count as expected");
		}
		else
		{
			System.out.println("Count not matches");
		}
	}
	@Test
	public void foodcheck()
	{
		String actualsrc=driver.getPageSource();
		String expsource="FOOD";
		if(actualsrc.contains(expsource))
		{
			System.out.println("Page contains food as expected");
		}
		else
		{
			System.out.println("Food not found");
		}
	}
	@Test
	public void health()
	{
		driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
	}
}
