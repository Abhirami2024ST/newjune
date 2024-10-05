package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();	
		driver.get("https://www.rediffmail.com");
		
	}
@Test
public void dropdown()
{
	driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
    Select mn = new Select(driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr[22]/td[3]/select[2]")));
    mn.selectByValue("06");
    Select dn=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
    dn.selectByVisibleText("21");
    Select yn=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
    yn.selectByVisibleText("2021");
	
}
}
