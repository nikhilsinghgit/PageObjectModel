package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	//@FindBy(name="username")
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']")
	WebElement signInbtn;
	
	@FindBy(xpath ="//input[@name='email']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	//@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	@FindBy(xpath="(//img[contains(@class,'img-responsive')])[1]")
	WebElement crmLogo;
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() throws InterruptedException{
		Thread.sleep(5000);
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() throws InterruptedException{
		Thread.sleep(5000);
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException{
		Thread.sleep(5000);
		signInbtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}
