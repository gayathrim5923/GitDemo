package Automation.CucumberLatest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public  static WebDriver driver;
	
	public static Properties prop;
	public  static WebDriver getDriver() throws IOException
	{
		prop =new Properties();
		FileInputStream fp=new FileInputStream("C:\\Users\\Vinay\\workspace\\CucumberLatest\\src\\test\\java\\Automation\\CucumberLatest\\global.properties");;
		prop.load(fp);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get(prop.getProperty("url"));
		 return driver;
	}

}
