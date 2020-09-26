package com.begining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AndroidUIAutomatorTest extends LaunchAppUsingEmulator 
{
	
	public static void main(String args[]) throws MalformedURLException
	{
		driver= initialization();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		/*Syntax: attribute(“value”);
		Java wouldn’t allow double quotes inside double quotes. 
		To make this happen we need to use backward slash before inside the double quotes.*/
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		
		int notclickable_elements=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
		System.out.println(notclickable_elements);
	}

}
