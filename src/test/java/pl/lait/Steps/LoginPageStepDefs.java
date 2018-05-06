package pl.lait.Steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import pl.lait.pageObjects.LoginPage;
import pl.lait.przychodnia3.Init;

public class LoginPageStepDefs extends Init{
	
	WebDriver driver = getDriver();
	LoginPage loginPage;
	
	@Given("^I open main page$")
	public void i_open_main_page() throws Throwable {
	    log("zakładam, że strona jest otwarta");
	}

	@When("^I click link \"([^\"]*)\"$")
	public void i_click_link(String arg1) throws Throwable {
	    loginPage = new LoginPage();
		loginPage.goToLoginPage();
	}

	@Then("^I should see login page$")
	public void i_should_see_login_page() throws Throwable {
	    assertTrue("Nieprawidłowy tutuł strony", driver.getTitle().equals("Sign-on: Mercury Tours")); 
	}
	
	@After
	public void end() {
		endTest();
	}

}
