package com.ecommerse;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

/**
 * 
 * @author Shekhar
 * Default class name for toast message is " android.widget.Toast".
 * If there are more than toast message then need to use index concept.
 */
public class ToastMessageHandling extends LaunchApp
{
	
	public static void main(String args[]) throws MalformedURLException
	{
		initialization();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
	    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    
	    String toastmessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
	    
	    System.out.println(toastmessage);
		
	}

}
