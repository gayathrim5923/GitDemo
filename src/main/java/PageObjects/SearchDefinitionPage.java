package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchDefinitionPage {
	
	public WebDriver driver;
	public SearchDefinitionPage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search= By.xpath("//input[@type='search']");
	
	public WebElement getSearch()
	{
		return driver.findElement(Search);
	}

}
