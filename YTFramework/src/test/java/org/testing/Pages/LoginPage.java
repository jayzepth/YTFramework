package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	ChromeDriver driver;
	//FirefoxDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver, Properties pr)
	//public LoginPage(FirefoxDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}
	public void Signin(String UserName,String Password) throws InterruptedException
	{
		WebElement signinButton = driver.findElement(By.xpath(pr.getProperty("SigninButton")));
		signinButton.click();
		WebElement emailTextBox = driver.findElement(By.name(pr.getProperty("EmailTextBOxByname")));
		emailTextBox.sendKeys(UserName);
		WebElement NextButton = driver.findElement(By.id(pr.getProperty("EmailNextButtonId")));
		NextButton.click();
		Thread.sleep(5000);
		WebElement PasswordTextBox = driver.findElement(By.xpath(pr.getProperty("PasswordTextBOx")));
		PasswordTextBox.sendKeys(Password);
		WebElement passNext = driver.findElement(By.id(pr.getProperty("PasswordNextButtonId")));
		passNext.click();
		Thread.sleep(5000);
	}

}
