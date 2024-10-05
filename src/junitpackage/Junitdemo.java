package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	@Test
	public void textVerification()
	{
		String src=driver.getPageSource();
		if(src.contains("Images"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text not present");
		}
	}
	@After
	public void termination()
	{
		driver.quit ();
	}

}
