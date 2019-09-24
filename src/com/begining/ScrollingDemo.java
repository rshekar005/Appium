package com.begining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ScrollingDemo extends LaunchAppUsingEmulator{

	public static void main(String[] args) throws MalformedURLException 
	{
		driver=initialization();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		//UISelector is a method in AndroidUIAutomator. With the help of this method we can identify mobile elements.
		/*Scrolling is not supported by selenium. In order to scroll appium uses the UIScrollable class which is normally used by developes.
		as a tested we don't need in depth knowledge of UIScrollable. */
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();

	}

}
