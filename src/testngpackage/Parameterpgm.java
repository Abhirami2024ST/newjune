package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterpgm 
{
	@Parameters ("v")
@Test
public void test(String v)
{
	System.out.println("v="+v);
}	
	
}
