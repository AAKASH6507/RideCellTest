package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHandler {
	public static WebDriverWait myWait;
	public static WebDriver driver;
	public DriverHandler() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		DriverHandler.driver.manage().window().maximize();
	    DriverHandler.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    DriverHandler.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);	
		myWait = new WebDriverWait(driver, 10000, 3000);
		
	}
}
