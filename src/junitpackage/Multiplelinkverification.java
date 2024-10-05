package junitpackage;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinkverification 
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void linkverification()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("Total links count:"+li.size());
	 for(WebElement link:li)
	 {
		String l=link.getAttribute("href");
		verifylink(l);
	 }
}
private void verifylink(String l) 
{
	try
	{
		URI ob=new URI(l);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("Succesfull response code is 200---"+l);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Broken link response code is 404---"+l);
		}
		else
		{
			System.out.println("Invalid response code");
		}
	}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
}
