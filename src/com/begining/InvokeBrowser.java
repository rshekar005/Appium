package com.begining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class InvokeBrowser {

	 static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException 
	{
	
        DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android-9-Shekar");	

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		driver = new AndroidDriver<>(new URL("http://127.0.01:4723/wd/hub"), capabilities);		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("testmfino005@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='m_login_password']")).sendKeys("mFIno@3600");
		
		driver.findElement(By.name("login")).click();
		
		
      
	}

}
