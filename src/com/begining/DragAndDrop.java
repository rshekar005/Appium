package com.begining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DragAndDrop extends LaunchAppUsingEmulator
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		driver= initialization();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//*[@content-desc='Drag and Drop']")).click();
		
		//longpress(source)//move(destination)//release.
		TouchAction t = new TouchAction(driver);
		WebElement sourceElement= driver.findElement(By.xpath("(//android.view.View)[2]"));
		WebElement destination= driver.findElement(By.xpath("(//android.view.View)[3]"));
		t.longPress(LongPressOptions.longPressOptions().
				withElement(element(sourceElement))).
		        moveTo(element(destination)).
		        release().perform();
		
		

	}

}
