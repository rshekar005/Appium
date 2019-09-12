package com.begining;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Basics extends LaunchAppUsingEmulator
{
	
public static void main(String args[]) throws MalformedURLException
{
	driver=initialization();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	//syntax for xpath (//tagname[@attributename='value']). Here android.widget.TextView is a tagname(class) and text is a attribute and Preference is a value.
	driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
	
	driver.findElement(By.id("android:id/checkbox")).click();
	
	/*UI contains same locators for multiple objects then use 
	1st way:(//tagname)[index of an object]
    2nd way: //tagname.get[index of an object]
    */
  
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
	
	driver.findElements(By.className("android.widget.Button")).get(1).click();
	
}

}
