package org.testing.TestScript;
import java.io.IOException;

import org.testing.Assertion.Assert;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Utilities.ReportHandling;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TC1 extends Base
{
	@Test
	public void Trending() throws InterruptedException, IOException
	{
		ExtentReports report = ReportHandling.TakeReport("C:\\\\Users\\\\Admin\\\\Desktop\\\\ScreenShot\\\\Report.html");
		ExtentTest test = report.startTest("TC1");
		
		LoginPage Login = new LoginPage(driver, pr);
		Login.Signin("jayautomation2@gmail.com", "Manu@5252");
		
		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Admin\\Desktop\\ScreenShot\\HomePage.jpg");
		
		Assert.Assert1("https://www.youtube.com/", driver.getCurrentUrl(), test);
		HomePage homepage = new HomePage(driver, pr);
		homepage.NavigateToTranding();
		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Admin\\Desktop\\ScreenShot\\TrandingPage.jpg");
		Assert.Assert1("https://www.youtube.com/", driver.getCurrentUrl(), test);
		
		LogoutPage Logout = new LogoutPage(driver, pr);
		Logout.SignOut();
		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Admin\\Desktop\\ScreenShot\\Signout.jpg");
		Assert.Assert1("https://www.youtube.com/", driver.getCurrentUrl(), test);
		
		report.endTest(test);
		report.flush();

	}

}
