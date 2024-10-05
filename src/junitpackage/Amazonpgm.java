package junitpackage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm 
{
ChromeDriver driver;
@Before
public void startUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void homepage()
{
	WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchfield.sendKeys("mobiles",Keys.ENTER);//searching mobile on search bar
	driver.navigate().back();
    driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();//click on cart icon
    driver.navigate().back();
	driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span[1]")).click();//click on hello sign in option
	WebElement emailfield=driver.findElement(By.xpath("//div[@id='claim-input-container']/input"));
	emailfield.sendKeys("7907890318",Keys.ENTER);
	driver.navigate().back();
    driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();//click on mobile option from menu bar
	driver.navigate().back();//navigating backwards
	driver.findElement(By.xpath("//div[@id='nav-tools']/a/span[1]/span[2]")).click();//click on language option
	driver.navigate().back();
	driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[5]")).click();//click on today's deals
	driver.findElement(By.xpath("//div[@id='nav-main']/div[1]")).click();//click on hamburger icon
	driver.navigate().back();
	
	
	
}
}
