package org.testing.TestScript;
import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.Test;

public class TC6 extends Base
{
@Test
	public void CommentOnAVideo() throws InterruptedException
	{
		LoginPage Login = new LoginPage(driver, pr);
		Login.Signin("jayautomation2@gmail.com", "Manu@5252");
		
		VideoPlayPage video = new VideoPlayPage(driver, pr);
		video.playVodeo(3);
		
		video.CommentOnVideo("Nice Content");
		
		LogoutPage Logout = new LogoutPage(driver, pr);
		Logout.SignOut();

	}
}
