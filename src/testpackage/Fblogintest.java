package testpackage;
import org.testng.annotations.Test;

import pagepackage.Fbloginpage;

public class Fblogintest extends Baseclass
{
	@Test
	public void logintest()
	{
		Fbloginpage obj=new Fbloginpage(driver);
        obj.setValues("abhiramiaravind000@gmail.com", "abhiramiaravind");
		obj.loginclick();
		driver.navigate().back();
		
	}
	

}
