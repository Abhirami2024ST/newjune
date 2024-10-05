package testngpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya 
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com/collections/aw-collection");
	}
	@Test
	public void test() throws IOException 
	{
		String actualtitle=driver.getTitle();
		String exptitle="JANASYA";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("Title as expected");
		}
		else
		{
			System.out.println("Title not matches");
		}
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total links count:"+li.size());
		int expcount=400;
		int actcount=li.size();
		if(actcount==expcount)
		{
			System.out.println("Count as expected");
		}
		else
		{
			System.out.println("Count not matches");
		}
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement n = driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary"));
		WebElement saaga=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/div/ul/li[1]/ul/li[3]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(n).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/div/ul/li[1]/ul/li[3]/a"))).click();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\sachin\\Desktop\\screenshot.png"));
		
	}
	
	
}
