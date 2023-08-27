package org.testing.Assertion;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assert 
{
	public static void Assert1(String expected, String actual, ExtentTest Test)
	{
		if(expected.equals(actual))
		{
			Test.log(LogStatus.PASS, "TestCase is getting Pass");
			System.out.println("Passed");
		}
		else
		{
			Test.log(LogStatus.FAIL, "TestCase is getting Failed");
			System.out.println("Failed");
		}
	}



}
