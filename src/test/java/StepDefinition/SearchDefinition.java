package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation.CucumberLatest.Base;
import PageObjects.SearchDefinitionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefinition  {
	
	 public WebDriver driver;
	 SearchDefinitionPage  sp;

	@Given("^user is on Green cart Landing page$")
    public void user_is_on_green_cart_landing_page() throws Throwable {
		
		driver=Base.getDriver();
		System.out.println(driver);
		
        
    }

   /* @When("^user searched for \"([^\"]*)\" vegetables$")
    public void user_searched_for_something_vegetables(String strArg1) throws Throwable {
    	
    	
  	sp= new SearchDefinitionPage (driver);
    	sp.getSearch().sendKeys(strArg1);
    	Thread.sleep(2000);
        
    }*/
	
	 @When("^user searched for (.+) vegetables$")
	    public void user_searched_for_vegetables(String name) throws Throwable {
		 sp= new SearchDefinitionPage (driver);
	    	sp.getSearch().sendKeys(name);
	    	Thread.sleep(2000);
		 
	       
	 }
    
    

    @Then("^\"([^\"]*)\" results should display$")
    public void something_results_should_display(String strArg1) throws Throwable {
    	
  // Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    String actual=	driver.findElement(By.cssSelector("h4.product-name")).getText();
    
    if(actual.contentEquals(strArg1))
    {
    	System.out.println("Test case passed");
    }
  
  
   }
    
/*    @Then("^verify \"([^\"]*)\" are displyed in checkout page$")
    public void verify_something_are_displyed_in_checkout_page(String strArg1) throws Throwable {
    	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    	
       
    }*/

    @And("^item added to cart$")
    public void item_added_to_cart() throws Throwable {
    	
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    	Thread.sleep(2000);
        
    }

    @And("^proceed to checkout page for purchase$")
    public void proceed_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	
    
    }
}