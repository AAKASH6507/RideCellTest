package testClasses;

import Utilities.DriverHandler;
import io.cucumber.java.en.And;
import pageFactory.DashboardPage;

public class Dashboard {
	DashboardPage dshPage;
	
	@And("user is on dashboard page")
	public void check_user_is_on_dashboard_page() throws InterruptedException {
		dshPage = new DashboardPage(DriverHandler.driver);
		Thread.sleep(6000);
		//dshPage.dismissPopIfAny();
		//dshPage.avtarIsDisplayed();
	}//
	

}
