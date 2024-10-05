package testngpackage;
import java.util.ArrayList;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowdetails 
{
	 ChromeDriver driver;
	 @BeforeTest
	 public void setUp() 
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com");
	 }
	 @Test
	 public void test()
	 {
		 System.out.println("title of google:"+driver.getTitle());
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.facebook.com");
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.ebay.com");
		 System.out.println(driver.getTitle());
		 ArrayList<String>windowdetails=new ArrayList<>(driver.getWindowHandles());
		 driver.switchTo().window(windowdetails.get(1));
		 System.out.println(driver.getTitle());
	 }	

}
