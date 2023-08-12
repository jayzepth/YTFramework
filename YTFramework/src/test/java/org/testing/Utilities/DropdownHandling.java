package org.testing.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling 
{
	public static void DropdownHandlingBasedupOnIndex(WebElement element, int indexNumber)
	{
		Select select = new Select(element);
		select.selectByIndex(indexNumber);
	}
	public static void DropdownHandlingBasedupOnValue(WebElement element, String Value)
	{
		Select select = new Select(element);
		select.selectByValue(Value);
	}
	public static void DropdownHandlingBasedupOnVisibleText(WebElement element, String VisibleText)
	{
		Select select = new Select(element);
		select.selectByVisibleText(VisibleText);
	}
	
}
