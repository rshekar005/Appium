package com.ecommerse;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class AddtoCart extends EcommerceHomePage
{
 static String productPrices;
	public static AndroidDriver<AndroidElement> addcart() throws MalformedURLException 
	{
         homePage();
         
         driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        /*Here Using MobileBy as an locator finder.
         * used resource id in srolling to get list of product and then used matches method to find the text in a product list.
         * 
        */
         driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\"))."
          		+ "scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
     /*    int NumberOfPages=driver.findElements(By.id("com.androidsample.generalstore:id/rvProductList")).size();
         System.out.println("Number of pages " +NumberOfPages);*/
         //list of products in a page
         int productsize=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
         System.out.println("Number of products in a page is "+productsize);
        /* for(int i=0;i<productsize;i++)
         {
             String productNames = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
             if(productNames.equalsIgnoreCase("Jordan 6 Rings"))
        	 {
        		 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
        	     System.out.println("Product Name are :"+productNames);
        		 
        	}
             System.out.println("Product Name are :"+productNames);
             break;
         }*/
         double sum=0;
      for(int i=0;i<productsize;i++)
      {
    	  String productNames = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
          driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
          System.out.println("Product Name is :"+productNames);
    	   productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
    	  System.out.println("Product Price of " +productNames+ " is " +getAmount(productPrices)); 	
    	  double amount=getAmount(productPrices);
    	  System.out.println(sum=amount+sum);
      }
     driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); 
     // Gestures
    /* WebElement checkbox= driver.findElement(By.className("android.widget.CheckBox"));
     WebElement agree = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
     TouchAction touchaction= new TouchAction(driver);
     
     touchaction.tap(tapOptions().withElement(element(checkbox))).perform();
     touchaction.longPress(longPressOptions().withElement(element(agree)).withDuration(ofSeconds(2))).perform();
     driver.findElement(By.xpath("//*[@text='CLOSE']")).click();
  */
     driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
   
	return driver;
	}
    public static double getAmount(String price)
    {
  	  String amount= price.substring(1);
  	  double d= Double.parseDouble(amount);
  	  return d;
    }

}
