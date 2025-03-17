package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepsDefinitions {
	public WebDriver driver;
	testContextSetup testContextSetup;
	
	public LoginPageStepsDefinitions(testContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
	
	@Given("User is on saucedemo Login Page")
	public void user_is_on_saucedemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "/Users/sajidsarwar/documents/chromedriver-mac-arm64/chromedriver");
		testContextSetup.driver= new ChromeDriver();
		testContextSetup.driver.get("https://www.saucedemo.com/");
	    System.out.println("Login page displayed");
	}
	@When("^User logs in with username (.+) and password (.+)$")
	public void user_logs_in_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.driver.findElement(By.id("user-name")).sendKeys(username);
		testContextSetup.driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.driver.findElement(By.id("login-button")).click();
	}
	
	
	@Then("Error Message is displayed")
	public void error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Error displayed");
	}
	
	@Then("Problem Message is displayed")
	public void problem_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Problem message displayed");
	}
	
	@Then("Lockedout error Message is displayed")
	public void lockedout_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Lockedout error message displayed");
	}
	
	@Then("Homepage is displayed after a delay")
	public void homepage_is_displayed_after_a_delay() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Homepage is displayed after a delay");
	}

	

}
