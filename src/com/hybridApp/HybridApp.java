package com.hybridApp;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.ecommerse.AddtoCart;

public class HybridApp extends AddtoCart{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AddtoCart add = new AddtoCart();
		add.addcart();
		
		Thread.sleep(5000);
		
		Set<String> contextnames= driver.getContextHandles();
		for(String context: contextnames)
		{
			System.out.println(contextnames);
		}
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.context("WEBVIEW_com.androidsample.generalstore");
	
		driver.findElement(By.name("q")).sendKeys("Hello Appium -- Webview in mobile");
		
		
	}

}
