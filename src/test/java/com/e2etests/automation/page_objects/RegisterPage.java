package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {

	private ConfigFileReader configFileReader;

	@FindBy(how = How.XPATH, using = "//a[text()='REGISTER']")
	public static WebElement registre;

	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adresse;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;

	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;

	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement cPassword;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement envoyer;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Note')]")
	public static WebElement registerMessage;

	// constructor

	public RegisterPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();

	}

	// method
	public void goToURL() {

		Setup.getDriver().get(configFileReader.getProperties("home.url"));

	}

	public void clickRegistre() {

		registre.click();

	}

	public void fillFirstName(String fname) {
		firstName.sendKeys(fname);

	}

	public void fillLastName(String lname) {
		lastName.sendKeys(lname);

	}

	public void fillPhone(String phonenum) {

		phone.sendKeys(phonenum);
	}

	public void fillEmail(String emailAdress) {
		email.sendKeys(emailAdress);

	}

	public void fillAdress(String adressee) {
		adresse.sendKeys(adressee);

	}

	public void fillCity(String cityy) {
		city.sendKeys(cityy);

	}

	public void fillState(String statee) {
		state.sendKeys(statee);

	}

	public void fillPostalCode(String postalCodee) {
		postalCode.sendKeys(postalCodee);

	}

	public void fillCountry(String countryy) {
		
		Select select = new Select(country);
		select.selectByValue("TUNISIA");
		

	}

	public void fillUserName(String userNamee) {
		userName.sendKeys(userNamee);

	}

	public void fillPassword(String passwordd) {
		password.sendKeys(passwordd);

	}

	public void fillConfirmPassword(String confirmPassword) {
		cPassword.sendKeys(confirmPassword);

	}

	public void clickEnvoyer() {

		envoyer.click();

	}

}
