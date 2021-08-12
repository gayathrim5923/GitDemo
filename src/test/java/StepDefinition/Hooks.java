package StepDefinition;
import Automation.CucumberLatest.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforemobiletestvalidation()
	{
		System.out.println("Hooks before mobile test ");
	}
	
	@After("@SeleniumTest")
	public void aftertestvalidation()
	{
		driver.close();
     System.out.println("Hooks after testvalidation ");//comment
	}
	
	@Before("@WebTest")
	public void beforewebtestvalidation()
	{
		System.out.println("Hooks before webtest ");
	}
	
}