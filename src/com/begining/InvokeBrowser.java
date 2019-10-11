package com.begining;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import okio.Timeout;

public class InvokeBrowser {

	 static AndroidDriver<AndroidElement> driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
	
	                        
        DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android-9-Shekar");	

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		driver = new AndroidDriver<>(new URL("http://127.0.01:4723/wd/hub"), capabilities);		
		
	/*	driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("testmfino005@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='m_login_password']")).sendKeys("mFIno@3600");
		
		driver.findElement(By.name("login")).click();*/
		
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.SECONDS);

		
	/*	WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//WebElement elem=  driver.findElement(By.linkText("https://rukminim1.flixcart.com/flap/267/284/image/e937e943676972c8.jpg?q=90"));
		WebElement elem=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("https://rukminim1.flixcart.com/flap/267/284/image/e937e943676972c8.jpg?q=90")));*/
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	
		
		
		
      
	}

}
