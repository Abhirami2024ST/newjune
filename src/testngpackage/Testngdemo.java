package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo 
{
@BeforeTest
public void setUp()
{
	System.out.println("before test");
}
@BeforeMethod
public void urlloading()
{
	System.out.println("before method");
}
	
@Test(priority = 3)
public void test1()
{
	System.out.println("test 1");
}
@Test(priority = 2, invocationCount = 3)
public void test2()
{
	System.out.println("test 2");
}
@Test(priority = 4,enabled = false)
public void test3()
{
	System.out.println("test 3");
}
@Test(priority = 1, dependsOnMethods = {"test1"})
public void test4()
{
	System.out.println("test 4");
}
@AfterMethod
public void method1()
{
	System.out.println("after method");
}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
}
	
}
