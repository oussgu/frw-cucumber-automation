package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthenticationPage {
	
	
      private ConfigFileReader configFileReader ;
	/* @findBy */

	@FindBy(how = How.NAME, using = "userName")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnSubmit;

	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement welcomeMessage;

	public AuthenticationPage() {
		PageFactory.initElements(Setup.getDriver(),this);
		this.configFileReader = new ConfigFileReader();
	}
	
	
	/* Create Method */
	
	public void goToURL() {
		
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
		
	}

	public  void fillUserName(String name) {
		userName.sendKeys(name);

	}

	public  void  fillpassword(String passWord) {
		password.sendKeys(passWord);

	}

	public  void clickSubmitButton() {
		btnSubmit.click();

	}

}
