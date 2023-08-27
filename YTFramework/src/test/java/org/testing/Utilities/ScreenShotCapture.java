package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotCapture 
{
	//public static void takeScreenShot(ChromeDriver driver, String FilePath) throws IOException
	public static void takeScreenShot(FirefoxDriver driver, String FilePath) throws IOException
	{
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(FilePath));
	}

}
