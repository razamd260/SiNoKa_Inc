package com.SiNoKa_In.erp.loginHomePageLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLogout {
     
      
	public LoginPageLogout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
    private WebElement usernameEdt;

  
    
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	@FindBy(xpath="//span[text()='Home']")
	private WebElement homepage;
	
	@FindBy(xpath="//span[text()='admin']")
	private WebElement userprofileclick;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logout;

    public WebElement getuserprofileclick() {
    	return userprofileclick;
    }

    public WebElement getlogout() {
    	return logout;
    }
    
    public WebElement gethomepage() {
    	return homepage;
    }
	
}
