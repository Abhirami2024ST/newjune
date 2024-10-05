package webdriverdemo;

import org.openqa.selenium.chrome.ChromeDriver;

 public class Webdriverdemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//opening browser
		driver.get("https://www.google.com");//opening url or application
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
		driver.close();
		
	}

}
