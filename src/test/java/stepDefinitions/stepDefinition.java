package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition extends base{
	


@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
	driver =initializeDriver();
}

@Given("^Navigate to \"([^\"]*)\" site$")
public void navigate_to_site(String arg1) throws Throwable {
    	driver.get(arg1);
}

@Given("^Click on Login link in Homepage to land on sign in page$")
public void click_on_Login_link_in_Homepage_to_land_on_sign_in_page() throws Throwable {
	LandingPage l=new LandingPage(driver);
	l.getLogin(); //driver.findElement(By.css()
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(arg1);
	lp.getPassword().sendKeys(arg2);
	lp.getLogin().click();
	
}

@Then("^Verify the user is succesfully logged in$")
public void verify_the_user_is_succesfully_logged_in() throws Throwable {
	
}


	

}