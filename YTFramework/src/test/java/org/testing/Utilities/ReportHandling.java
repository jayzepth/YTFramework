package org.testing.Utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling 
{
	public static ExtentReports TakeReport(String Path)
	{
		ExtentReports report = new ExtentReports(Path, false);
		return report;
	}
}
