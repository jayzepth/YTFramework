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
	public void NavigateToTranding() throws InterruptedException
	{
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("Trending")));
		trending.click();
		Thread.sleep(3000);
	}
	public void NavigateToHistory() throws InterruptedException
	{
		WebElement History = driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
		Thread.sleep(3000);
	}
	public void NavigateToSubsription() throws InterruptedException
	{
		WebElement Subscription = driver.findElement(By.xpath(pr.getProperty("Subscription")));
		Subscription.click();
		Thread.sleep(3000);
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
