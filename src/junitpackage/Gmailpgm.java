package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailpgm 
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void gmailSearch()
{
	driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div/div/a")).click();
	
}
}
