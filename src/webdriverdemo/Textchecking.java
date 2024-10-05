package webdriverdemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textchecking {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String actualsrc=driver.getPageSource();
String expsource="Gmail";
if(actualsrc.contains(expsource))
{
	System.out.println("Page contains title as expected");
}
else
{
	System.out.println("Not found");
}
driver.close();    
	}

}
