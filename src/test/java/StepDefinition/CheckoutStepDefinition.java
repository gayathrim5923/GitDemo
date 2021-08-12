package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import Automation.CucumberLatest.Base;
import PageObjects.CheckoutPage;
import io.cucumber.java.en.Then;

public class CheckoutStepDefinition extends Base {
	CheckoutPage  ch;

	/* @Then("^verify \"([^\"]*)\" are displyed in checkout page$")
	    public void verify_something_are_displyed_in_checkout_page(String strArg1) throws Throwable {
		ch= new CheckoutPage(driver);
		 Assert.assertTrue(ch.getProductName().getText().contains(strArg1));
		 
		 }*/
	
	
	@Then("^verify (.+) are displyed in checkout page$")
    public void verify_are_displyed_in_checkout_page(String name) throws Throwable {
		
		ch= new CheckoutPage(driver);
		 Assert.assertTrue(ch.getProductName().getText().contains(name));
		 
       
}

}