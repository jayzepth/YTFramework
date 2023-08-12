package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlayPage 
{
	ChromeDriver driver;
	Properties pr;
	public VideoPlayPage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void playVodeo(int PositionOfvideo) throws InterruptedException
	{
		List<WebElement> videos = driver.findElements(By.xpath(pr.getProperty("Videolist")));
		for(int i= 0;i<videos.size();i++)
			{
				if(i==PositionOfvideo)
				{
					videos.get(i).click();
					break;
				}
			}
		Thread.sleep(5000);
	}
	public void likeVideo() throws InterruptedException
	{
		WebElement likeButton = driver.findElement(By.xpath(pr.getProperty("likeButton")));
		likeButton.click();
		Thread.sleep(2000);
	}
	public void SubscribeChannel() throws InterruptedException
	{
		WebElement SubscribeButton = driver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
		SubscribeButton.click();
		Thread.sleep(3000);
	}
	public void CommentOnVideo(String AddComment) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		
		WebElement commentField = driver.findElement(By.xpath(pr.getProperty("CommentField")));
		commentField.click();
		Thread.sleep(2000);
		WebElement commentTextbox = driver.findElement(By.xpath(pr.getProperty("CommentTextBox")));
		commentTextbox.sendKeys(AddComment);
		Thread.sleep(5000);
		WebElement commnetButton = driver.findElement(By.xpath(pr.getProperty("CommentButton")));
		commnetButton.click();
		Thread.sleep(2000);
	}

}
