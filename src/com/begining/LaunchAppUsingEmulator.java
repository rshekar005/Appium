package com.begining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Version;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppUsingEmulator {

	static AndroidDriver<AndroidElement> driver ;
	
   public static AndroidDriver<AndroidElement> initialization() throws MalformedURLException
	{
		//Path of the apk file
		File file = new File("src");
		File f2= new File(file, "ApiDemos-debug.apk");
		
		//Desiredcapabilities is a class which acts as a client converts code to json and will interact with appium server.
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Below command used to which emulator need to connect to run script. If emulator is not connected then need to give device name
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ShekarEmulatorPie");	
	   // cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
	    cap.setPlatform(Platform.ANDROID);
	    		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		// below command used to run the Native app which present in device. Value will the path of the apk.
		//Here file is nothing but apk.
	      cap.setCapability(MobileCapabilityType.APP,f2.getAbsolutePath());//
		System.out.println("Android path is "+f2.getAbsolutePath());
		
		
		//AndroidDriver driver= new AndroidDriver("connections to appium server", "object of desired cap");//Only this command sent to appium server.
		//wd -- webdriver
	//AndroidElement used as a generics to AndroidDriver so that we can use AndroidElement.
		 driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.01:4723/wd/hub"), cap);		
		 
		 return driver;
		
	}
	


}
