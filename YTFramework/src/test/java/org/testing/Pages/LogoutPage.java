package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogoutPage 
{
	ChromeDriver driver;
	//FirefoxDriver driver;
	Properties pr;
	public LogoutPage(ChromeDriver driver, Properties pr)
	//public LogoutPage(FirefoxDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void SignOut() throws InterruptedException
	{
		WebElement avtButton  = driver.findElement(By.id(pr.getProperty("AvtarButtonId")));
		avtButton.click();
		Thread.sleep(2000);
		WebElement signOut = driver.findElement(By.xpath(pr.getProperty("SignOut")));
		signOut.click();
	}
}
