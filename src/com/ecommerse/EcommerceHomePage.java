package com.ecommerse;

import java.awt.List;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EcommerceHomePage extends LaunchApp {

	public static AndroidDriver<AndroidElement> homePage() throws MalformedURLException 
	{
		initialization();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))").click();
	    driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Rajashekar");
	    driver.hideKeyboard();
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		return driver;
	    
	    
		
	}

}
