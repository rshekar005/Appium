package com.begining;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppUsingRealDevice 
{
	static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> Launch()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Here device name should be Android Device
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		return driver;
	}

}
