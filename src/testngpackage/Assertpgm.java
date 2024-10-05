package testngpackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm 
{
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
		@Test
		public void titlecheck()
		{
			{
				String actualtitle=driver.getTitle();
				String exptitle="Google";
				System.out.println("Title is:"+actualtitle);
				Assert.assertEquals(actualtitle, exptitle);
				System.out.println("Title verified");
	
	
			}
}
}