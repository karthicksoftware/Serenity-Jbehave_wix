package com.wix.stepdefinitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.wix.steps.HomePageSteps;

import net.thucydides.core.annotations.Steps;

public class Define_HomePage{
	
	@Steps
	HomePageSteps homePageSteps;
	
	@Given("the browser is successfully launched")
	public void givenTheBrowserIsSuccessfullyLaunched() {
	  homePageSteps.open_browser();
	}

	@When("the user lands on the homepage")
	public void whenTheUserLandsOnTheHomepage(String expectedTitle) {
	  homePageSteps.verify_get_started_button_is_visible();
	}

	@Then("the user should validate the current page title '$expectedTitle'")
	public void thenTheUserShouldValidateTheCurrentPageTitle(String expectedTitle) {
		homePageSteps.verify_the_title_of_the_homepage(expectedTitle);
	}

}
