package testClasses;

import org.openqa.selenium.WebDriver;

import Utilities.DriverHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.HomePage;
import pageFactory.LoginPage;
public class LoginTest {
	static WebDriver driver = null;
	LoginPage login;
	HomePage home;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		new DriverHandler();
	}

	
	@Then("close driver")
	public void please_close_driver() throws InterruptedException {
		Thread.sleep(2000);
		DriverHandler.driver.close();
		DriverHandler.driver.quit();
	}
}
