package com.ny.spepdefinatinos;









import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ny.basepase.SupperBaseClass;
import com.ny.masterpagefactory.ZooplzElementspagefactory;
import com.ny.utility.WaitHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SteodefinationClass extends SupperBaseClass {
	 ZooplzElementspagefactory pf;
	private Object element;
	
	
@Given("User can open any browser")
public void user_can_open_any_browser() {
	
	setUpOrInitialization ();
	pf = PageFactory.initElements(driver, ZooplzElementspagefactory.class);//pf is refarance v
	//pf = new ZooplzElementspagefactory();
}

@Given("User able to enter {string} url")
public void user_able_to_enter_url(String url) {
	//for enter the url
	//driver.get("https://www.zoopla.co.uk/");
	//driver.navigate().to(url);
	
}

@When("User able to click on the login button")
public void user_able_to_click_on_the_login_button() {
	   // WaitHelper.WaitForElement( pf.getClicksingButton(),10);
	    // 1 way    
	 pf.getClicksingButton().click();
	//2nd way
	 // WebElement element =  driver.findElement(By.xpath(" (//*[text()='Sign in'])[2]"));
	 //  ele.click();
	// 3rd way:-i have to use action class
	// WebElement element =  driver.findElement(By.xpath(" "));
	// Actions action = new Actions (driver);
	//action.moveToElement(element).click().build().perform();
	 //4th way 
	// WebElement element =  driver.findElement(By.xpath(" "));
	// JavascriptExecutor jsClick = (JavascriptExecutor) driver;
	 //jsClick.executeScript("arguments[0].click();", element);
}

@When("User enter the userName {string} and password {string}")
public void user_enter_the_user_name_and_password(String userName, String pwd) {
	 //WaitHelper.WaitForElement(   pf.getEnterUserName(),20);
      pf.getEnterUserName().sendKeys(userName);
      //WaitHelper.WaitForElement( pf.getEnterPasword(),20);
	  pf.getEnterPasword().sendKeys(pwd);

}
@When("User click on the signing button")
public void user_click_on_the_signing_button() {
	 // WaitHelper.WaitForElement( pf.getClickLoginButton(),10);
	pf.getClickLoginButton().click();
   
}     

@Then("User able to verify successfully login & verify the homepage title")
public void user_able_to_verify_successfully_login_verify_the_homepage_title() throws Exception {
	//1st way:-if, else condison/Incorrect email &paaaword.please check and try again
	String actual = "MyZoopla - Zoopla";
if(driver.getPageSource().contains("Incorrect email &paaaword.please check and try again")) {
driver.close();		
Assert.assertTrue(false);

}		
else {
	Thread.sleep(2000);
 Assert.assertEquals(actual,driver.getTitle());		
 System.out.println(" MY expected result is:"+driver.getTitle());   
 
}		


}	

   
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	

