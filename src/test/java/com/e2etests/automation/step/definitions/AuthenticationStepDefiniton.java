package com.e2etests.automation.step.definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefiniton {

	private AuthenticationPage authentificationPage;

	public AuthenticationStepDefiniton() {
		this.authentificationPage = new AuthenticationPage();
	}

	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {

		authentificationPage.goToURL();
	}

	@When("je saisi le user name {string}")
	public void jeSaisiLeUserName(String name) {
		authentificationPage.fillUserName(name);
	}

	@When("je saisi le password  {string}")
	public void jeSaisiLePassword(String password) {
		authentificationPage.fillpassword(password);
	}

	@When("je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authentificationPage.clickSubmitButton();
	}

	@Then("je me rederige vers la pagee home {string}")
	public void jeMeRederigeVersLaPageeHome(String text) {

		String message = authentificationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);

	}

}
