package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver driver;
	Properties pr;
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void NavigateToTranding()
	{
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
		trending.click();
	}
	public void NavigateToHistory()
	{
		WebElement History = driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
	}
	public void NavigateToSubsription()
	{
		WebElement Subscription = driver.findElement(By.xpath(pr.getProperty("Subscription")));
		Subscription.click();
	}
	public void NavigateToWatchLater() throws InterruptedException
	{
		WebElement wetchlater = driver.findElement(By.xpath(pr.getProperty("Watchlater")));
		wetchlater.click();
		Thread.sleep(3000);
	}
	public void NavigateToLibrary() throws InterruptedException
	{
		WebElement library = driver.findElement(By.xpath(pr.getProperty("library")));
		library.click();
		Thread.sleep(3000);
	}
	
	

}
