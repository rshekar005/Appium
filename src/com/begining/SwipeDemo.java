package com.begining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends LaunchAppUsingEmulator {

	public static void main(String[] args) throws MalformedURLException 
	{
		driver=initialization();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		driver.findElement(By.xpath("*//*[@content-desc='9']")).click();
		
		//Swipping.
		TouchAction touchaction= new TouchAction(driver);
		WebElement swippingelement=driver.findElement(By.xpath("*//*[@content-desc='15']"));
		WebElement toElement= driver.findElement(By.xpath("*//*[@content-desc='45']"));
		touchaction.longPress(longPressOptions().
				withElement(element(swippingelement)).
				withDuration(ofSeconds(2))).
		        moveTo(element(toElement)).release().perform();
		                                            
		
		
		

	}

}
