package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.testContextSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageStepsDefinitions {
	
	testContextSetup testContextSetup;
	
	public HomepageStepsDefinitions(testContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}
	
	
	
	
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
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
		System.out.println("Swag Labs heading displayed");
	}
	@When("User clicks on Article Name")
	public void user_clicks_on_article_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Article name displayed");
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
	

	

}
