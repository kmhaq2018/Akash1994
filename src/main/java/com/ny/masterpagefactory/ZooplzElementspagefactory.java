package com.ny.masterpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ny.basepase.SupperBaseClass;

public class ZooplzElementspagefactory extends SupperBaseClass{

	public ZooplzElementspagefactory() {
		//what deference berween this & supper keyword
		//this key word is refer the current class values 
		//Supper key word refer the parents class values
		PageFactory.initElements(driver,this);
}	
	@FindBy(xpath = "(//*[text()='Sign in'])[2]")
	@CacheLookup	
	private WebElement clicksingButton;

	@FindBy(id = "input-email-address")
	@CacheLookup	
	private WebElement enterUserName;


	@FindBy(id ="input-password" )
	@CacheLookup	
	private WebElement enterPasword;

	@FindBy(xpath = " (//*[text()='Sign in'])[5]")
	@CacheLookup	
	private WebElement clickLoginButton;

	public WebElement getClicksingButton() {
		return clicksingButton;
	}

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	public WebElement getEnterPasword() {
		return enterPasword;
	}

	public WebElement getClickLoginButton() {
		return clickLoginButton;
	}

		
		
	
	
	
	
	
	

	
	
	
	
	
}
