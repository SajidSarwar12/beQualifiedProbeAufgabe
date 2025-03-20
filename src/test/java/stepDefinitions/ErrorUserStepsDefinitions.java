package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class ErrorUserStepsDefinitions {
	public ChromeDriver driver;
	testContextSetup testContextSetup;
	
	public ErrorUserStepsDefinitions(testContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
	
//	@Given("User is on saucedemo Login Page")
//	public void user_is_on_saucedemo_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/sajidsarwar/documents/chromedriver-mac-arm64/chromedriver");
//		//To run in headless mode
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		testContextSetup.driver= new ChromeDriver(options);
//		
//		testContextSetup.driver.get("https://www.saucedemo.com/");
//	    System.out.println("Login page displayed");
//	}
//	@When("^User logs in with username (.+) and password (.+)$")
//	public void user_logs_in_with_username_and_password(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		testContextSetup.driver.findElement(By.id("user-name")).sendKeys(username);
//		testContextSetup.driver.findElement(By.id("password")).sendKeys(password);
//	}
//	@When("User clicks on Login button")
//	public void user_clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		testContextSetup.driver.findElement(By.id("login-button")).click();
//	}
	
	
	@Then("Error Message is displayed")
	public void error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedTitle = "Swag Labs";
		String actualTitle = testContextSetup.driver.findElement(By.xpath("//*[@class='app_logo']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Error displayed");
	}
	
	@Then("Remove button is non-clickable")
	public void remove_button_is_non_clickable() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[contains(text(), 'Remove')]")).click();
		System.out.println("Remove button is non-clickable");
	}
	
	@Then("Finish button is non-clickable")
	public void finish_button_is_non_clickable() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Finish button is non-clickable");
	}
	
	@Then("User clicks on cancel button")
	public void user_clicks_on_cancel_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cancel button clicked.");
	}
	
	

	
   
}
