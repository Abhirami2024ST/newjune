package testpackage;

import org.testng.annotations.Test;

import pagepackage.Createpage;

public class Createpagetest extends Baseclass
{
	
	@Test
	public void createpagetest() 
	{
		Createpage cpage=new Createpage(driver);
		cpage.createPageClick();
		cpage.getSource();
		
	}

}
