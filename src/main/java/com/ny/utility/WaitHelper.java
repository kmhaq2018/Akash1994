package com.ny.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public static  WebDriver driver;
	
	
    public	  WaitHelper ( WebDriver drive){
		 
		 
		this.driver =drive;
		 
		 
	 }
	
	public static void  WaitForElement(WebElement element,long timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
	    wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
}
	
	
	
}
