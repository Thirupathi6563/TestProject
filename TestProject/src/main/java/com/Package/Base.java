package com.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public Properties p;
	public WebDriver initilaizeBrowser() throws IOException
	{
	 p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Desireddy\\TestProject\\src\\main\\java\\com\\Package\\data.properties");
	p.load(fis);
	String browsername=p.getProperty("browser"); 
	System.out.println(browsername);
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desireddy\\Desktop\\download folders for selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Desireddy\\Desktop\\download folders for selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("ie"))
   {
	   
   }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
	}
}
