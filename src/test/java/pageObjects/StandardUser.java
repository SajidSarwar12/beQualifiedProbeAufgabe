package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StandardUser {
	
	public WebDriver driver;
	
	public StandardUser(WebDriver driver) {
		this.driver = driver;
	}

	By Username = By.id("user-name");
	By Password = By.id("password");
	By Applogo = By.xpath("//*[@class='app_logo']");
	



public void enterUsername(String username) {
	driver.findElement(Username).sendKeys(username);
	
	}

public void enterPassword(String password) {
	driver.findElement(Password).sendKeys(password);
	
	}

//public void verifyTitle(String actualTitle) {
//	String expectedTitle = "Swag Labs";
//	actualTitle = driver.findElement(Applogo).getText();
//	Assert.assertEquals(actualTitle, expectedTitle);
//}



}
