package junitpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecode 
{
String link="https://www.facebook.com";
String link1="https://www.google.com";
@Test
public void test() throws URISyntaxException, MalformedURLException, IOException
{
	URI ob=new URI(link);
	URI ob1=new URI(link1);
	HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
	HttpURLConnection d=(HttpURLConnection)ob1.toURL().openConnection();
	System.out.println(c.getResponseCode());
	System.out.println(d.getResponseCode());
}
}