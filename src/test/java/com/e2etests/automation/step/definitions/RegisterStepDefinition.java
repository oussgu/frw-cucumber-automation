package com.e2etests.automation.step.definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage;

	public RegisterStepDefinition() {

		this.registerPage = new RegisterPage();
	}

	@Given("je me connecte sur l application Mercury pour l inscription")
	public void jeMeConnecteSurLApplicationMercury() {
		registerPage.goToURL();

	} 

	@When("je click sur le button registre")
	public void jeClickSurLeButtonRegistre() {
		registerPage.clickRegistre();
	}

	@When("je saisi le First Name  {string}")
	public void jeSaisiLeFirstName(String fName) {
		registerPage.fillFirstName(fName);
	}

	@When("je saisi le Last Name  {string}")
	public void jeSaisiLeLastName(String lName) {
		registerPage.fillLastName(lName);
	}

	@When("je saisi le Phone  {string}")
	public void jeSaisiLePhone(String phone) {
		registerPage.fillPhone(phone);
	}

	@When("je saisi le Email  {string}")
	public void jeSaisiLeEmail(String email) {
		registerPage.fillEmail(email);
	}

	@When("je saisi l Address {string}")
	public void jeSaisiLAddress(String adress) {
		registerPage.fillAdress(adress);
	}

	@When("je saisi la City  {string}")
	public void jeSaisiLaCity(String city) {
		registerPage.fillCity(city);
	}

	@When("je saisi le State\\/Province {string}")
	public void jeSaisiLeStateProvince(String state) {
		registerPage.fillState(state);
	}

	@When("je saisi le Postal Code {string}")
	public void jeSaisiLePostalCode(String pCode) {
		registerPage.fillPostalCode(pCode);
	}

	@When("je choisie le Country {string}")
	public void jeChoisieLeCountry(String country) {
		registerPage.fillCountry(country);
	}

	@When("je saisi le User Name {string}")
	public void jeSaisiLeUserName(String userName) {
		registerPage.fillUserName(userName);
	}

	@When("je saisi le Password {string}")
	public void jeSaisiLePassword(String password) {
		registerPage.fillPassword(password);
	}

	@When("je saisi le Confirm Password {string}")
	public void jeSaisiLeConfirmPassword(String cPassword) {
		registerPage.fillConfirmPassword(cPassword);

	}

	@When("je clique sur le boutton Envoyer")
	public void jeCliqueSurLeBouttonEnvoyer() {
		registerPage.clickEnvoyer();
	}

	@Then("je me rederige vers la pagee de Registre avec succee {string}")
	public void jeMeRederigeVersLaPageeDeRegistreAvecSuccee(String text) {

		String message = registerPage.registerMessage.getText();
		Assert.assertEquals(message, text);

	}

}
