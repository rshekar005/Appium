package com.ecommerse;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp 
{
	public static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> initialization() throws MalformedURLException
	{
		File f= new File("C:\\Users\\Shekhar\\git\\AppiumBeginers\\src\\General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android-9-Shekar");
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		System.out.println("path of the apk is "+f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		driver= new AndroidDriver<>(new URL("http://127.0.01:4723/wd/hub"), cap);
		System.out.println("Server Started");
		return driver;
	}

}
