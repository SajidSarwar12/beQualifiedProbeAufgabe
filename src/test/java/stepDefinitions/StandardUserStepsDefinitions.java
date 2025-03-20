package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StandardUser;
import utils.testContextSetup;

public class StandardUserStepsDefinitions {
	
	testContextSetup testContextSetup;
	
	public StandardUserStepsDefinitions(testContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
	
	@Given("User is on saucedemo Login Page")
	public void user_is_on_saucedemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "/Users/sajidsarwar/documents/chromedriver-mac-arm64/chromedriver");
		//To run in headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		testContextSetup.driver= new ChromeDriver(options);
		
		testContextSetup.driver.get("https://www.saucedemo.com/");
	    System.out.println("Login page displayed");
	}
	@When("^User logs in with username (.+) and password (.+)$")
	public void user_logs_in_with_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		StandardUser standardUser = new StandardUser(testContextSetup.driver);
		standardUser.enterUsername(username);
		standardUser.enterPassword(password);
		
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.driver.findElement(By.id("login-button")).click();
	}
	
	
	
	
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedTitle = "Swag Labs";
		String actualTitle = testContextSetup.driver.findElement(By.xpath("//*[@class='app_logo']")).getText();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Homepage displayed");
	}
	
	
	@Given("User is on saucedemo Homepage")
	public void user_is_on_saucedemo_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Source demo Homepage displayed");
	}
	@When("User can see Swag Labs heading")
	public void user_can_see_swag_labs_heading() {
	    // Write code here that turns the phrase above into concrete actions
//		StandardUser standardUser = new StandardUser(testContextSetup.driver);
//		String actualTitle = null;
//		standardUser.verifyTitle(actualTitle);		
//		System.out.println("Swag Labs heading displayed");
	}
	@When("User clicks on Article Name")
	public void user_clicks_on_article_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Article name Clicked");
	}
	@Then("Article details page is displayed")
	public void article_details_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Article Page displayed");
	}
	
	@When("Add to cart button is clicked")
	public void add_to_cart_button_is_clicked() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add to cart button clicked");
	}
	@When("User clicks on Remove button")
	public void user_clicks_on_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Remove button clicked");
	}
	@Then("Cart is decremented with {int} item")
	public void cart_is_decremented_with_item(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart decremented");
	}
	
	@When("User clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Add to cart clicked");
	}
	@Then("Cart is incremented with {int} item")
	public void cart_is_incremented_with_item(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart incremented");
	}
	
	@When("Default Ascending filter is active")
	public void default_ascending_filter_is_active() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Ascending filter active");
	}
	@When("User clicks on filter dropdown")
	public void user_clicks_on_filter_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("dropdown clicked");
	}
	@When("User clicks on Name \\(Z to A) filter")
	public void user_clicks_on_name_z_to_a_filter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("descending filter clicked");
	}
	@Then("Name \\(Z to A filter) is activated")
	public void name_z_to_a_filter_is_activated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("descending filter activated");
	}
	
	@Given("User is on Article details page")
	public void user_is_on_article_details_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Article details page navigated");
	}
	@When("User clicks on Cart Icon on top right")
	public void user_clicks_on_cart_icon_on_top_right() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart Icon clicked");
	}
	@Then("User Navigates to cart page")
	public void user_navigates_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart page navigated");
	}
	
	@Given("User is on Checkout Completion page")
	public void user_is_on_checkout_completion_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout Completion page navigated");
	}
	@When("User clicks on Back Home button")
	public void user_clicks_on_back_home_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Back Home button clicked");
	}
	@Then("User Navigates to Home page")
	public void user_navigates_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page navigated");
	}
	
	@Given("User is on Checkout Information page")
	public void user_is_on_checkout_information_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout Information page navigated");
	}
	@When("User Enters First Name , Last Name and Zipcode")
	public void user_enters_first_name_last_name_and_zipcode() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Credentials entered");
	}
	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Continue button clicked");
	}
	@Then("User Navigates to Checkout Confirmation Page")
	public void user_navigates_to_checkout_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout Confirmation page navigated");
	}
	
	@When("Menu is opened")
	public void menu_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Menu is opened");
	}
	@When("User clicks Logout menu item")
	public void user_clicks_logout_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Logout menu item clicked");
	}
	@Then("User navigates to Login Page.")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Page navigated");
	}
	
	@Given("User is on Checkout Overview page")
	public void user_is_on_checkout_overview_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout Overview Page navigated");
	}
	@When("User clicks on Finish button")
	public void user_clicks_on_finish_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Finish button clicked");
	}
	@Then("User Navigates to Checkout Completion page")
	public void user_navigates_to_checkout_completion_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout Completion Page navigated");
	}
	@When("User clicks on hamburger menu icon")
	public void user_clicks_on_hamburger_menu_icon() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hamburger menu icon clicked");
	}
	@When("User clicks on All Items")
	public void user_clicks_on_all_items() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("All Items clicked");
	}
	@Then("All Items are displayed")
	public void all_items_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("All items displayed");
	}
	
	@When("User clicks on Reset App state")
	public void user_clicks_on_reset_app_state() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Reset App state clicked");
	}
	@Then("Cart is emptied")
	public void cart_is_emptied() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart is emptied");
	}
	@Given("User is on cart page")
	public void user_is_on_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("cart page navigated");
	}
	@When("User clicks on Checkout button")
	public void user_clicks_on_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout button clicked");
	}
	@Then("User Navigates to Personal Information Page")
	public void user_navigates_to_personal_information_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Personal Information Page navigated");
	}
	
	

	

}
