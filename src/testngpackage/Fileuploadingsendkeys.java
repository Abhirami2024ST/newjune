package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadingsendkeys 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		a.sendKeys("C:\\Users\\sachin\\Desktop\\Abhirami\\NOTES\\JUnit Tutorial.docx");
		WebElement but=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		but.click();
		WebElement sub=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		sub.click();
	}
}
