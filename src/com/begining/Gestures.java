package com.begining;
/**
 * Gestures noting but scrollings, swiping, longpress etc
 */
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import static org.testng.Assert.assertEquals;

public class Gestures extends LaunchAppUsingEmulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		driver= initialization();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		 
		TouchAction t = new TouchAction(driver);
		//Now tapping on Expandable lists element
		
		/*Need to tap on below element. We can use click() as above, but it is an advanced version to tap on element.
		Challenge is that we need to import tapOptions() and element() manually, other options manually.
		 */
		WebElement expandlist=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		t.tap(tapOptions().withElement(element(expandlist))).perform();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		// Used xpath with contains.
		//Syntax:  //tagname[contains(text(),'value')]
		
		//long press on People Names.
		WebElement peoplename= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		//Need to import longpress manually and for duration need to import ofseconds from java.time package
		t.longPress(longPressOptions().withElement(element(peoplename))).release().perform();
		
		String expected= driver.findElement(By.id("android:id/title")).getText();
		
		Thread.sleep(5000);
		assertEquals(driver.findElement(By.id("android:id/title")).getText(), expected);
		
		
		
	
		
        
	}

}
