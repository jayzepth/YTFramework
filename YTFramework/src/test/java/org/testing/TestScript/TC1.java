package org.testing.TestScript;
import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void Trending() throws InterruptedException, IOException
	{
		LoginPage Login = new LoginPage(driver, pr);
		Login.Signin("jayautomation2@gmail.com", "Manu@5252");
//		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Jay\\Desktop\\ScreenShot\\HomePage.jpg");
		
		HomePage homepage = new HomePage(driver, pr);
		homepage.NavigateToTranding();
		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Jay\\Desktop\\ScreenShot\\TrandingPage.jpg");
		
		LogoutPage Logout = new LogoutPage(driver, pr);
		Logout.SignOut();
//		ScreenShotCapture.takeScreenShot(driver, "C:\\Users\\Jay\\Desktop\\ScreenShot\\Signout.jpg");

	}

}
