package org.testing.TestScript;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testng.annotations.Test;

public class TC3 extends Base
{
	@Test
	public void Subscription() throws InterruptedException
	{
		LoginPage Login = new LoginPage(driver, pr);
		Login.Signin("jayautomation2@gmail.com", "Manu@5252");
		
		HomePage homepage = new HomePage(driver, pr);
		homepage.NavigateToSubsription();
		
		LogoutPage Logout = new LogoutPage(driver, pr);
		Logout.SignOut();
	}
	

}
