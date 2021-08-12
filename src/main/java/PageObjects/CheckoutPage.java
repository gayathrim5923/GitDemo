package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	
	public WebDriver driver;
	public CheckoutPage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	By productname= By.cssSelector("p.product-name");
	
	public WebElement getProductName()
	{
		return driver.findElement(productname);
	}
}
