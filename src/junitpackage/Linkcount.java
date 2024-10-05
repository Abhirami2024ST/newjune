package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void link()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total links count:"+li.size());
		 for(WebElement link:li)
		 {
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
//		for(int i=0;i<allLinks.size();i++){
//			System.out.println(i +" : "+ allLinks.get(i).getText());
//			}
		
	}
	

}
